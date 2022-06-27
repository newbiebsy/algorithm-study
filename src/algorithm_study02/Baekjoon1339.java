package algorithm_study02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baekjoon1339 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단어의 개수");
		
		int n = sc.nextInt();
		String str = null;
		
		// 문자열 담아줄 배열
		String[] test = new String[n];
		
		System.out.println(n);
		
		for(int i=0; i<n; i++) {
			System.out.print("단어 : ");
			str = sc.next();
			System.out.println(str);
			test[i] = str;
		}
		
		// 배열 큰수만큼 정렬
		Arrays.sort(test, Comparator.comparing(String::length).reversed());
		
		int num = 9;
		
		Map<String, Integer> mapping = new HashMap<String, Integer>(); 
		
		for (int i = 0; i < test.length; i++) {
			for(int j=0; j<test[i].length(); j++) {
				//mapping.put(test[i].charAt(j), );
			}
			
		}
		
		
	}
}
