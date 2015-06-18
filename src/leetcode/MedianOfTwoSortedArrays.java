package leetcode;
import java.util.Arrays;
public class MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] A, int[] B) {
		int	leftA = 0,
			rightA = A.length - 1,
			leftB = 0,
			rightB = B.length - 1,
			k = (A.length + B.length) / 2 + 1;
		//if total length is odd
		if ((A.length + B.length) % 2 != 0){
			return findMedianOfTwo(A, leftA, rightA, B, leftB, rightB, k);
		}
		//if total length is even
		else{
			return (findMedianOfTwo(A, leftA, rightA, B, leftB, rightB, k - 1) + 
					findMedianOfTwo(A, leftA, rightA, B, leftB, rightB, k)) / 2.0;
		}
        
    }
	private double findMedianOfTwo(int[] A, int leftA, int rightA, int[] B, int leftB, int rightB, int k){

		//calculate median of each array
		double medianA = findMedian(A, leftA, rightA);
		double medianB = findMedian(B, leftB, rightB);
		int subLenA = rightA - leftA + 1;
		int subLenB = rightB - leftB + 1;
		if (subLenA == 1 && subLenB == 1){
			if (A[leftA] > B[leftB]){
				if (k == 1) return B[leftB];
				else return A[leftA];
			}
			else{
				if (k == 1) return A[leftA];
				else return B[leftB];
			}
		}
		if (medianA > medianB){
			int number;
			if (subLenB % 2 != 0 || subLenB == 1){
				number = subLenA / 2 + subLenB / 2 + 1;
			}
			else{
				number = subLenA / 2 + subLenB / 2;
			}
		//medianA as partition point.
			if (number >= k){
		//target is in left part of A, A and right part of A is disposed.
				rightA = (leftA + rightA) / 2;
				return findMedianOfTwo(A, leftA, rightA, B, leftB, rightB, k);
			}
			else{
		//target not in left part of B.
				leftB = (leftB + rightB) / 2;
				k = k - subLenB / 2 + 1;
				return findMedianOfTwo(A, leftA, rightA, B, leftB, rightB, k);
			}
		}
		else if (medianA < medianB){
			int number;
			if (subLenA % 2 != 0 || subLenA == 1){
				number = subLenA / 2 + subLenB / 2 + 1;
			}
			else{
				number = subLenA / 2 + subLenB / 2;
			}
			if (number >= k){
			//target is in left part of B, B and right part of A is disposed.
				rightB = (leftB + rightB) / 2;
				return findMedianOfTwo(A, leftA, rightA, B, leftB, rightB, k);
			}
			else{
				leftA = (leftA + rightA) / 2;
				k = k - subLenA / 2;
				return findMedianOfTwo(A, leftA, rightA, B, leftB, rightB, k);
			}
		}
		else{
			return medianA;
		}
		
	}
	private double findMedian(int[] a, int i, int j){
		int len = j - i + 1;
		if (len == 1){
			return a[i];
		}
		else if (len % 2 != 0){
			return a[len / 2 + i];
		}
		else{
			return (a[len / 2 + i] + a[len / 2 + i - 1]) / 2;
		}
	}
	//test
	public void test(int[] A, int[] B){
		double result = findMedianSortedArrays(A, B);
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		System.out.println("Median: " + result);
	}
	public static void main(String[] args){
		int[] A = {1,2,3,4,5,6};
		int[] B = {5, 6,7,8,9,10};
		MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
		solution.test(A, B);
	}
}
