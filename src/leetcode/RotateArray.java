package leetcode;
import java.util.Arrays;
public class RotateArray {
	public void rotate(int[] nums, int k){
		int divider, remainer;
		k = preprocess(nums, k);
		divider = k;
		remainer = nums.length - divider;
		int from, to;
		from = 0;
		to = k;
		while (divider <= remainer){
			shift(nums, from, to, k);
			from = 0;
			to += k;
			remainer -= divider;
			if (divider > remainer){
				divider = remainer;
				remainer = k;
				from = to + 1;
				to = from + divider - nums.length;
				shift(nums, from, to, k);
				
				
			}
		}
	}
	//helper method
	public int preprocess(int[] nums, int k){
		while (k >= nums.length)
			k = k - nums.length;
		return k;
	}
	public void swap(int[] nums, int i, int j)
	{
		int k = nums[i];
		nums[i] = nums[j];
		nums[j] = k;
	}
	private void shift(int[] nums, int from, int to, int divider){
		for (int i = 0; i < divider; i++){
			swap(nums, from, to);
			System.out.println(Arrays.toString(nums));
			System.out.println();
			from++;
			to++;
		}
	}
	//test
	public void test(int[] nums, int k){
		rotate(nums, k);
		System.out.println(Arrays.toString(nums));
	}
	public static void main(String args[]){
		int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int k1 = 3, k2 = 7, k3 = 75;
		RotateArray ra = new RotateArray();
		ra.test(nums, k1);
	}
}
