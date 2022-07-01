package algorithm_study03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

// 좌표 압축
public class Baekjoon18870 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 출력 빠르게 하기 위해 StringBuilder 이용
		StringBuilder sb = new StringBuilder();
		
		// 마찬가지로 입력 빠르게 받기 위해 BufferedReader 이용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력받을 수의 개수
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// x값들을 담아줄 배열 생성
		int[] xArr = new int[n];
		// sort용 배열 하나 더 생성
		int[] sortArr = new int[n];
		
		// 배열에 담아주기
		for(int i=0;i<xArr.length;i++) {
			xArr[i] = Integer.parseInt((st.nextToken()));
			
		}
		sortArr = xArr.clone();
		
		// sortArray 정렬
		Arrays.sort(sortArr);
		
		// hashmap 생성
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(n);
		
		int cnt = 0;
		for(int i=0; i<sortArr.length; i++) {
			// map에 sortArr[i] 값이 key값으로 없으면 추가
			if(!map.containsKey(sortArr[i])) {
				map.put(sortArr[i], cnt);
				cnt++;
			}
		}
		// 원래 배열인 xArr의 값으로 map의 value값 꺼내서 stringBuffer에 추가
		for(int i=0; i<xArr.length;i++) {
			sb.append(map.get(xArr[i])+" ");
		}
		
		System.out.println(sb);
	}
}
