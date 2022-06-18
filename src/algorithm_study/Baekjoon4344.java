package algorithm_study;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon4344 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("테스트 케이스의 수 입력 : ");
		int c = sc.nextInt();
		
		for(int j=0; j<c; j++) {
			System.out.print("학생 수 입력 : ");
			int n = sc.nextInt();

			int sum = 0;
			float avg =0;
			// 평균 넘는 학생 카운트
			int cnt = 0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			for(int i=0; i<n; i++) {
				System.out.print("score : ");
				int score = sc.nextInt();
				sum += score;
				list.add(score);
				
			}
			avg = (float)sum/n;
			System.out.printf("avg : %.3f",avg);
			System.out.println();
			
			for(int h=0; h<list.size(); h++) {
				if(avg < list.get(h) )
				cnt ++;
			}
			System.out.println("평균 넘는 학생 수 : "+cnt);
			System.out.println("총 학생 수 : "+n);
			System.out.println((float)(n/cnt)*100);
		}
		
	}
}
