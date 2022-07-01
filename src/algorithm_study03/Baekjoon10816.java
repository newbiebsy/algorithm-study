package algorithm_study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Baekjoon10816 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		// 첫째 줄 n 입력
		int n = Integer.parseInt(br.readLine());

		// 둘째 줄 배열 생성
		int[] arrN = new int[n];

		// 둘째 줄 입력
		StringTokenizer st = new StringTokenizer(br.readLine());

		// arrN에 값 담기
		for (int i = 0; i < arrN.length; i++) {
			arrN[i] = Integer.parseInt(st.nextToken());
		}

		// 셋째 줄 m 입력
		int m = Integer.parseInt(br.readLine());

		// 넷째 줄 배열 생성
		int[] arrM = new int[m];

		// 넷째 줄 입력
		StringTokenizer st2 = new StringTokenizer(br.readLine());

		// arrM에 값 담기
		for (int i = 0; i < arrM.length; i++) {
			arrM[i] = Integer.parseInt(st2.nextToken());
		}
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		// arrM map에 담기
		for(int i=0;i<arrM.length;i++) {
			map.put(arrM[i], 0);
		}
		
		// arrN의 요소가 map의 key값으로 있다면 value +1씩 증가
		for(int i=0;i<arrN.length;i++) {
			if(map.containsKey(arrN[i])) {
				map.put(arrN[i],map.getOrDefault(arrN[i], 0)+1);
			}
		}
		
		// map의 value값을 arrM의 요소 순서에 맞춰 sb에 추가
		for (int i = 0; i < arrM.length; i++) {
			sb.append(map.get(arrM[i]));
		}
		
		System.out.println(sb);
	}
}
