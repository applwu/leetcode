package leetcode;

public class MinimumPathSum {
	public int minPathSum(int[][] grid) {
		if (grid.length == 0)
			return 0;
		int i = 0, j = 0;
		for(i = 0; i < grid.length; i++) {
			for (j = 0; j < grid[i].length; j++) {
				if (j == 0 && i != 0)
					grid[i][j] += grid[i - 1][j];
				else if (i == 0 && j != 0)
					grid[i][j] += grid[i][j - 1];
				else if (i != 0 && j != 0)
					grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
			}
 		}
		return grid[i - 1][j - 1];
	}
	
	//test
	public static void main(String[] args) {
		MinimumPathSum solution = new MinimumPathSum();
		int[][] grid = {{1,2,3,4,5},{1,3,2,4,5},{5,3,4,2,1}};
		int[][] grid2 = {};
		System.out.println(solution.minPathSum(grid2));
	}
}
