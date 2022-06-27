package algorithm_study02;

import java.util.Scanner;

public class Baekjoon17478 {

	int num = 0;
	int n = 0;

	String msg1 = "\"재귀함수가 뭔가요?\"";
	String msg2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
	String msg3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
	String msg4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
	String[] msg = { msg1, msg2, msg3, msg4 };

	String underbar = "____";

	public void startChatBot(int num) {
		this.num = num;
		chatBot(num);
	}

	public int chatBot(int n) {
		// 전역변수 n의 값 조정
		this.n = n;

		printMsg();
		if (n == 0) {
			printFooter(n);
			return 0;
		}
		return chatBot(n - 1);
	}

	// footer 출력
	public int printFooter(int n) {

		String footer1 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
		String footer2 = "라고 답변하였지.";

		// 종료 조건
		if (n == num) {
			// 마지막 하나 출력
			System.out.println(footer2);
			return 0;
		}
		// 처음 printFooter() 실행시
		if (n == 0) {
			for (int i = 0; i < num; i++) {
				msg1 = underbar + msg1;
				footer1 = underbar + footer1;
				footer2 = underbar + footer2;
			}
			System.out.println(msg1);
			System.out.println(footer1);
			System.out.println(footer2);
		} else {
			for (int i = 0; i < (num) - n; i++) {
				footer2 = underbar + footer2;
			}
			System.out.println(footer2);
		}

		return printFooter(n + 1);
	}

	public void printMsg() {

		// 처음으로 printMsg()가 실행된 경우
		if (num == n) {
			String header = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.";
			System.out.println(header);
			
			for (int i = 0; i < 4; i++) {
				System.out.println(msg[i]);
			}

		// 2번째부터 printMsg()가 실행된 경우
		} else if (n != 0) {
			for (int i = 0; i < 4; i++) {
				msg[i] = underbar + msg[i];
			}
			for (int i = 0; i < 4; i++) {
				System.out.println(msg[i]);
			}
		}

	} // printMsg() end

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Baekjoon17478 test = new Baekjoon17478();
		test.startChatBot(sc.nextInt());
	}
}
