package algorithm_study02;

import java.util.Scanner;

public class Baekjoon14659 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 수
		int pickN = sc.nextInt();
		// 봉우리
		int[] n = new int[pickN];

		// 오른쪽으로 비교할 때 카운트
		int cnt = 0;

		// 최대값 계산
		int max = 0;

		// 첫번째 요소 대입, member보다 큰 요소 나올 시 아래 코드에서 그 요소로 대입
		int member = n[0];

		for (int i = 0; i < pickN; i++) {
			n[i] = sc.nextInt();
		}

		// 배열 순서대로 우측 요소와 비교
		for (int i = 0; i < n.length; i++) {

			if (member > n[i]) {
				cnt++;
			} else if (member < n[i]) {
				member = n[i];
				cnt = 0;
			}

			if (cnt > max) {
				max = cnt;
			}
		}

		System.out.println(max);
	}
}
