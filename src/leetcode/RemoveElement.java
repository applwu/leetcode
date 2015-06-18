package leetcode;

import java.util.Arrays;

public class RemoveElement {
	public int removeElement(int[] A, int elem) {
        if (A.length == 0) return 0;
        int j = A.length;
        for (int i = 0; i < j; i++){
        	while (A[i] == elem){
        		if (i == j) break;
        		A[i] = A[j - 1];
        		A[j - 1] = elem;
        		j--;		
        	}
        }
        return j;
    }
	//test
	public static void main(String[] args){
		RemoveElement solution = new RemoveElement();
		int[] A = {3,2,2,3};
		int elem = 2;
		int length = solution.removeElement(A, elem);
		System.out.println(length);
		System.out.println(Arrays.toString(A));
	}
}
