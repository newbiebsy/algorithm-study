package algorithm_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoostCourse01 {
	public static void main(String[] args) {
		
		int[] arr = {3, 5, 7, 9, 1,3,5,6,1,3,5,8};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0 )+1);
		}
		
		System.out.println(map);
		
		List<Integer> list = new ArrayList<Integer>(map.values());
		
		list.removeAll(Arrays.asList(1));
		
		if(list.size() == 0) {
			list.add(-1);
		}
		System.out.println(list);
	}


}
