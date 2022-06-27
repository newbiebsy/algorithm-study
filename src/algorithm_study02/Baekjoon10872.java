package algorithm_study02;

import java.util.Scanner;

public class Baekjoon10872 {
	
	// 재귀 이용해서 풀어보기
	public static int test(int n) {
		
		// 3 >> 3*2*1
		// 3 >> 3*(3-1)*(3-2)
		if(n <2) {
			return 1;
		}
		
		return n *test(n-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(test(sc.nextInt())); 
		
	}
}
