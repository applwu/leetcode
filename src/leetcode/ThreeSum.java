package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] num) {
		List<List<Integer>> threeSumList = new ArrayList<List<Integer>>();
		if (num.length < 3) 
			return threeSumList;
		for (int i = 0; i < num.length; i++){
			int[] twoSumList = twoSum(num, 0 - num[i]);
			if (i != twoSumList[0] && i != twoSumList[1]){
				System.out.println(i);
				System.out.println(twoSumList[0]);
				System.out.println(twoSumList[1]);
				List<Integer> result = new ArrayList<Integer>();
				result.add(num[i]);
				result.add(num[twoSumList[0]]);
				result.add(num[twoSumList[1]]);
				Collections.sort(result);
				if (!threeSumList.contains(result))
					threeSumList.add(result);
			}
		}
		return threeSumList;
    }

	private int[] twoSum(int[] num, int target) {
		int[] result = new int[2];
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < num.length; i++){
	    	if (map.containsKey(target - num[i]) && i != map.get(target - num[i])){
	    		result[0] = map.get(target - num[i]);
	    		result[1] = i;
	    	}
	    	else{
	    		map.put(num[i], i);
	    	}
	    }
	    return result;
	 }
	//test
	public static void main(String[] args){
			ThreeSum solution = new ThreeSum();
			int[] num = {7,-1,14,-12,-8,7,2,-15,8,8,-8,-14,-4,-5,7,9,11,-4,-15,-6,1,-14,4,3,10,-5,2,1,6,11,2,-2,-5,-7,-6,2,-15,11,-6,8,-4,2,1,-1,4,-6,-15,1,5,-15,10,14,9,-8,-6,4,-6,11,12,-15,7,-1,-9,9,-1,0,-4,-1,-12,-2,14,-9,7,0,-3,-4,1,-2,12,14,-10,0,5,14,-1,14,3,8,10,-8,8,-5,-2,6,-11,12,13,-7,-12,8,6,-13,14,-2,-5,-11,1,3,-6};
			System.out.println(solution.threeSum(num).toString());
	}
}
