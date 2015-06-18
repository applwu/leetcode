package leetcode;

import java.util.HashMap;
import java.util.Arrays;
public class Twosum {
	//version1:hashmap
	 public int[] twoSum(int[] numbers, int target) {
		 int[] result = new int[2];
	     HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	     for (int i = 0; i < numbers.length; i++){
	    	 if (map.containsKey(target - numbers[i])){
	    		 result[0] = map.get(target - numbers[i]) + 1;
	    		 result[1] = i + 1;
	    	 }
	    	 else{
	    		 map.put(numbers[i], i);
	    	 }
	     }
	     return result;
	 }
	 
	 //version2:sorting
	 public int[] twoSum_2(int[] numbers, int target) {
		 int[] result = new int[2];
		 //make a copy
		 int[] copy = new int[numbers.length];
		 System.arraycopy(numbers, 0, copy, 0, numbers.length);
		 Arrays.sort(copy);
		 int front, end;
		 front = 0;
		 end = copy.length - 1;
		 while (front < end){
			 if (copy[front] + copy[end] < target){
				 front++;
			 }
			 else if (copy[front] + copy[end] > target){
				 end++;
			 }
			 else{
				 break;
			 }
		 }
		 int result1 = copy[front];
		 int result2 = copy[end];
		 //check search result
		 if (result1 + result2 != target){
			 int[] notfound = {0,0};
			 return notfound;
		 }
		 int index1 = -1;
		 int index2 = -1;
		 for (int i = 0; i < numbers.length; i++){
			 if (numbers[i] == result1){
				 index1 = i + 1;
				 break;
			 }
		 }
		 System.out.println(index1);
		 for (int i = 0; i < numbers.length; i++){
			 System.out.println("i: " + i);
			 System.out.println("numbers[i]: " + numbers[i]);
			 System.out.println("result2: " + result2);
			 if (numbers[i] == result2){
				 index2 = i + 1;
				 if (index1 != index2){
					 break;
				 }
			 }
		 }
		 System.out.println(index2);
		 result[0] = index1;
		 result[1] = index2;
		 Arrays.sort(result);
		 return result;
	 }
	//test
	 public void test1(int[] numbers, int target){
		 int[] result = twoSum(numbers, target);
		 System.out.println(Arrays.toString(result));
	 }
	 public void test2(int[] numbers, int target){
		 int[] result = twoSum_2(numbers, target);
		 System.out.println(Arrays.toString(result));
	 }
	 public static void main(String[] args){
		 int[] numbers1 = {2,3,3,2,2};
		 int target1 = 7;
		 Twosum twosum = new Twosum();
		 twosum.test1(numbers1, target1);
		 twosum.test2(numbers1, target1);
	 }
}
