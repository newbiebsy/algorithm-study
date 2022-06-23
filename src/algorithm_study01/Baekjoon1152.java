package algorithm_study01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1152 {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String msg = br.readLine();
			if(msg.equals(" ")) {
				System.out.println(0);
			}else {
				String[] test = msg.split(" ");

				if(test[0].equals("")) {
					
					System.out.println(test.length-1);
				}else {
					System.out.println(test.length);
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
