package leetcode;

public class UniqueBinarySearchTrees {
	public int numTrees(int n) {
        if (n == 0)
        	return 1;
        int[] nums = new int[n + 1];
        for (int i = 0; i < n + 1; i++){
        	if (i == 0)
        		nums[i] = 1;
        	else {
	        	int k = i - 1;
	        	for (int j = 0;  j < i; j++){
	        		nums[i] += nums[j] * nums[k];
	        		k--;
	        	}
        	}
        }
        return nums[n];
    }
	
	//test
	public static void main(String[] args) {
		UniqueBinarySearchTrees solution = new UniqueBinarySearchTrees();
		System.out.println(solution.numTrees(0));
		System.out.println(solution.numTrees(1));
		System.out.println(solution.numTrees(2));
		System.out.println(solution.numTrees(3));
		System.out.println(solution.numTrees(4));
		System.out.println(solution.numTrees(5));
		System.out.println(solution.numTrees(6));
		System.out.println(solution.numTrees(7));
		System.out.println(solution.numTrees(8));
		System.out.println(solution.numTrees(9));
	}
}
