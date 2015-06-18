package leetcode;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right){
            int area = getArea(height, left, right);
            maxArea = Math.max(area, maxArea);
        	if (height[left] <= height[right])
        		left++;
        	else 
        		right--;
        }
        return maxArea;
        
    }
	private int getArea(int[] height, int left, int right){
		return (Math.min(height[left], height[right]) * (right - left));
	}
}
