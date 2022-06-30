package algorithm_study03;

import java.util.Scanner;

public class Baekjoon2839 {
		
	public static int sugarDelivery(int n) {
		// 봉지의 수
		int cnt = 0;
		
		if(n%5==0) {
			return n/5;
		}else if(n==4 || n==7) { // 4,7제외 하고는  3,5로 모든 수 조합가능
			return -1;
		}else {
			while(n%5!=0) {
				n -=3;
				cnt++;
				if(n%5 ==0) {
					return cnt+=n/5;
				}
			}
			return cnt;
		}
		
	}
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(Baekjoon2839.sugarDelivery(n));
		
		sc.close();
	}
}
