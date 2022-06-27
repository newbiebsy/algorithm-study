package jhta.quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Q0627 {
	
	public void verify(String str) {
		
		// 카드 정규식 패턴
		Pattern pt = Pattern.compile("(\\d{4}[\\s-]?){4}");
		// 주민등록번호 정규식..? 정확히는 \\d{6}[-\\s]?[1-4]?\\d{6} 이거인것 같다.
		Pattern pt2 = Pattern.compile("\\d{6}[-\\s]?\\d{7}");
		
		if(pt.matcher(str).matches()) {
			System.out.println("입력값 : [" + str + "] 는 카드번호가 맞습니다. ");
		}else if(pt2.matcher(str).matches()) {
			rrnVerify(str);
		}else {
			System.out.println("입력값 : [" + str + "] 는 개인정보가 아닙니다.");
		}
	}
	

	public void rrnVerify(String str) {
		// 오류검증번호 배열에 미리 담기
		int[] errNum = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

		// 입력받은 주민번호를 담을 배열 미리 생성
		int[] rrnArray = new int[13];

		// 연산해서 나오는 총합 변수
		int sum = 0;

		String strRrn = str;

		// 입력받은 주민번호 자리수가 14라면 == '-' 포함해서 입력한 경우 '-' 제거
		if (strRrn.length() == 14) {
			strRrn = strRrn.replace("-", "").replace(" ", "");
		}

//		System.out.println(strRrn);

		// 생성해놓은 배열에 형변환해서 담기
		for (int i = 0; i < rrnArray.length; i++) {
			rrnArray[i] = strRrn.charAt(i) - '0';
//					 System.out.print(rrnArray[i]);
		}

		// 배열에서 하나씩 꺼내서 연산
		for (int i = 0; i < errNum.length; i++) {
			sum += rrnArray[i] * errNum[i];
		}
//		System.out.println(sum);
		
		
		// 오류검증번호
		int m = (11 - (sum % 11))%10;
//		System.out.println(m);
		
		if (m == rrnArray[12]) {
			System.out.println("입력값 : [" + str + "] 는 주민번호가 맞습니다. ");

		} else {
			System.out.println("입력값 : [" + str + "] 는 개인정보가 아닙니다.");
		}
	}

	public static void main(String[] args) throws IOException {
		Q0627 q = new Q0627();
		
		BufferedReader bfrd = new BufferedReader(new FileReader("C:\\info.txt"));
		
		String str = "";
			
		while((str=bfrd.readLine()) != null) {
			if(!str.equals("")) {
				q.verify(str);
			}
		}
		
		bfrd.close();
	}
}
