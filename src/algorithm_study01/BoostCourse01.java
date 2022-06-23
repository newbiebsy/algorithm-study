package algorithm_study01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoostCourse01 {
	public static void main(String[] args) {
//		문제
//		자연수가 들어있는 배열 arr가 매개변수로 주어집니다. 배열 arr안의 숫자들 중에서 앞에 있는 숫자들부터 뒤에 중복되어 나타나는 숫자들 중복 횟수를 계산해서 배열로 return 하도록 solution 함수를 완성해주세요. 만약 중복되는 숫자가 없다면 배열에 -1을 채워서 return 하세요.
//
//		▶입출력 예 #1
//
//		arr = [1, 2, 3, 3, 3, 3, 4, 4]에서 3은 4번, 4는 2번씩 나타나므로 [4, 2]를 반환합니다.
//
//		▶입출력 예 #2
//
//		arr = [3, 2, 4, 4, 2, 5, 2, 5, 5]이면 2가 3회, 4가 2회, 5가 3회 나타나므로 [3, 2, 3]를 반환합니다.
//
//		▶입출력 예 #3
//
//		[3, 5, 7, 9, 1]에서 중복해서 나타나는 숫자는 없으므로 [-1]을 반환합니다.
//
//		##### 제한사항
//
//		- 배열 arr의 길이는 1 이상 100 이하의 자연수입니다.
//
//		- 배열 arr의 원소는 1 이상 100 이하의 자연수입니다.
		
		// 임의의 배열
		int[] arr = {3, 5, 7, 9, 1,3,5,6,1,3,5,8};
		
		// hashmap 이용 (hashmap은 key값은 중복되지 않고 value는 중복 가능)
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			// put 메서드와 getOrDefault 메서드 이용 (getOrDefault 메서드는 찾는 key가 
			// 존재한다면 key의 value를 리턴하고 key가 존재하지 않거나 value가 null이라면
			// default로 지정한 값을 반환)
			map.put(arr[i], map.getOrDefault(arr[i],0 )+1);
		}
		
		System.out.println(map);
		// map.values()를 이용해 value만을 뽑아서 list 객체에 담아줌
		List<Integer> list = new ArrayList<Integer>(map.values());
		
		// removeAll()은 매개변수로 collection을 받아서 해당하는 객체를 리스트에서 삭제.
		list.removeAll(Arrays.asList(1));
		
		// 만약 위의 라인에서 list안에 모든 요소가 삭제된 경우, 즉 처음 임의의 배열에 중복된 값이 없는경우는
		// -1을 반환해야 하므로 list에 -1 요소 추가
		if(list.size() == 0) {
			list.add(-1);
		}
		
		// 출력
		System.out.println(list);
	}


}
