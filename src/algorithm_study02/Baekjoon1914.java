package algorithm_study02;

import java.util.Scanner;

public class Baekjoon1914 {
	public static void main(String[] args) {
		// 하노이 탑
		
		// n 개 >> 1 : n >> 1 : n-1 >> n : n-1  
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// 하노이 공식 
		int num = ((int) Math.pow(2, n))-1;
		
		for(int i=0; i<num; i++) {
			
		}
	}
}
