package leetcode;

public class UniquePaths {
	public int uniquePathsII(int m, int n) {
        if (m == 1 || n == 1)
        	return 1;
        return uniquePathsII(m - 1, n) + uniquePathsII(m, n -1);
    }
	
	public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1)
        	return 1;
        int[][] nums = new int[m + 1][n + 1];
        for (int i = 1; i < m + 1; i++) {
        	for (int j = 1; j < n + 1; j++) {
        		if (i == 1 || j == 1)
        			nums[i][j] = 1;
        		else
        			nums[i][j] = nums[i - 1][j] + nums[i][j - 1];
        	}
        }
        return nums[m][n];
    }
	
	//test
	public static void main(String[] args) {
		UniquePaths solution = new UniquePaths();
		final long startTime = System.currentTimeMillis();
		System.out.println(solution.uniquePathsII(23, 12));
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
		
		final long startTimeII = System.currentTimeMillis();
		System.out.println(solution.uniquePaths(23, 12));
		final long endTimeII = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTimeII - startTimeII) );
	}
}
