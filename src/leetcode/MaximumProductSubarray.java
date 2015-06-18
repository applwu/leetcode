package leetcode;

public class MaximumProductSubarray {
	 public int maxProduct(int[] nums) {
	        int f = nums[0], g = nums[0], ans = nums[0];
	        for (int i = 1; i < nums.length; i++) {
	            int ff = Math.max(f * nums[i], Math.max(g * nums[i], nums[i]));
	            int gg = Math.min(g * nums[i], Math.min(f * nums[i], nums[i]));
	            ans = Math.max(ff, ans); 
	            f = ff; 
	            g = gg;
	            System.out.println(f);
	            System.out.println(g);
	            System.out.println(ans);
	        } 
	        return ans;
	   }
	 
	//test
	public static void main(String[] args) {
		int[] nums = {-5,2,4,1,-2,2};
		MaximumProductSubarray solution = new MaximumProductSubarray();
		System.out.println(solution.maxProduct(nums));
	}
}
