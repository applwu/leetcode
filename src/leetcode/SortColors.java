package leetcode;
import java.util.Arrays;
public class SortColors {
	public void sortColors(int[] nums) {
		int start = 0;
        int end = nums.length - 1;
        int i = 0;
        while(start < end && i <= end) {
        	if (nums[i] == 1 || nums[i] == 0 && i == start)
        		i++;
        	else if (nums[i] == 0)
        		swap(nums, i, start++);
        	else if (nums[i] == 2)
        		swap(nums, i, end--);
        	System.out.println(start);
        	System.out.println(end);
        	System.out.println(i);
        	System.out.println(Arrays.toString(nums));
        }
    }
	
	public void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}
	
	public static void main(String[] args) {
		SortColors solution = new SortColors();
		int[] nums = {2,1,0,2,1,0};
		int[] nums2 = {1,1};
		solution.sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
}
