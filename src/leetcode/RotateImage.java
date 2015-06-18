package leetcode;
import java.util.Arrays;


public class RotateImage {
	public void rotate(int[][] matrix) {
		if (matrix.length == 1)
			return;
		int n = matrix.length - 1;
        for (int i = 0; i < n / 2 + 1 ; i++) {
        	for (int j = i; j < n - i; j++) {
        		int temp = matrix[i][j];
        		matrix[i][j] = matrix[n - j][i];
        		matrix[n - j][i] = matrix[n - i][n - j];
        		matrix[n - i][n - j] = matrix[j][n - i];
        		matrix[j][n - i] = temp;
        	}
        }
    }
	
	//test
	public static void main(String[] args) {
		RotateImage solution = new RotateImage();
		int[][] matrix2 = {{1,2,3,4,5,6},
						  {7,8,9,10,11,12},
						  {13,14,15,16,17,18},
						  {19,20,21,22,23,24},
						  {25,26,27,28,29,30},
						  {31,32,33,34,35,36}
						 };
		int[][] matrix = {{1,2},{3,4}};
		solution.rotate(matrix);
		for (int[] i: matrix){
			System.out.println(Arrays.toString(i));
		}
	}
}
