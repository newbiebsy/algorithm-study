package algorithm_study02;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2750 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 케이스 넘버
		int cn = sc.nextInt();
		
		int[] num = new int[cn];
		
		for(int i=0; i<cn; i++) {
			num[i] = sc.nextInt();
			
		}
		
		Arrays.sort(num);
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
