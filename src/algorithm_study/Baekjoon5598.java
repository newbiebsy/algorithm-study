package algorithm_study;

import java.util.Scanner;

public class Baekjoon5598 {
	public static void main(String[] args) {
		// BufferedReader 사용이 더 빠르다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어 입력 : ");
		
		String cipher = sc.next();
		String result="";
		
		for(int i=0; i<cipher.length();i++) {
			char t = cipher.charAt(i);
			
			if(t<= 67) {
				result += (char)(t+23);
			}else {
				result += (char)(t-3);
			}
		}
		
		System.out.println("result : "+result);
		sc.close();
		
	}
}
