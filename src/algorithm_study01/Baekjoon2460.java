package algorithm_study01;

import java.util.Scanner;

public class Baekjoon2460 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 내린 사람
		int a = 0;
		
		// 탄 사람
		int b = 0;
		
		int sum = 0;
		int high = 0;
		
		for(int i=0; i<10; i++) {
			a = sc.nextInt();
			b = sc.nextInt();

			sum += b-a;
			if(high < sum) {
				high = sum;
			}
		}
		System.out.println(high);
	}

}
