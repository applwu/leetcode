package leetcode;
public class HappyNumber {
	public boolean isHappy(int n) {
		int m = 0;
        while (n != 0){
        	int digit = n % 10;
        	m += digit * digit;
        	n = n / 10;
        }
    	if (m == 1)
    		return true;
    	if (m == 4)
    		return false;
    	return isHappy(m);
    }
	public static void main(String[] args){
		HappyNumber solution = new HappyNumber();
		Boolean isHappy = solution.isHappy(6789);
		System.out.println(isHappy);
	}
}
