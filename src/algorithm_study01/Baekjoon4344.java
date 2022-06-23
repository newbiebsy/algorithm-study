package algorithm_study01;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon4344 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		float[] test = new float[c];
		
		for(int j=0; j<c; j++) {
			
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
			
			for(int h=0; h<list.size(); h++) {
				if(avg < list.get(h) )
				cnt ++;
			}
			test[j] = ((float)cnt/n)*100;
		}
		
		for (int i = 0; i < test.length; i++) {
			System.out.printf("%.3f%%",test[i]);
			System.out.println();
		}
	}
}
