package algorithm_study02;

import java.util.Scanner;

public class Baekjoon1002 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 입력받기
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();

			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			System.out.println(Baekjoon1002.getCoordinate(x1, y1, r1, x2, y2, r2));
		}

	}

	public static int getCoordinate(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		// 반지름(r)의 합
		double addR = Math.pow(r1+r2, 2);
		
		// 반지름(r)의 차
		double minusR = Math.pow(r1-r2, 2);
		
		// 두 점 사이의 거리
		double d = Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2); 
		
		// 경우의 수가 무한대인경우
		if(x1==x2 && y1==y2 && r1 == r2 ) return -1;
		// 경우의 수가 0인 경우
		else if(addR < d || d<minusR) return 0;
		// 경우의 수가 1인 경우
		else if(addR == d || d == minusR) return 1;
		else return 2;
		
	}
}
