package leetcode;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int forward = x, 
            backward = 0;
        while (forward > 0){
            if (forward >= 10)
                backward = backward * 10 + forward % 10;
            else 
                backward = backward * 10 + forward;
            forward = forward / 10;
        }
        return x == backward;
    }
	//test
	public static void main(String[] args){
		PalindromeNumber solution = new PalindromeNumber();
		boolean output = solution.isPalindrome(1);
		System.out.println(output);
	}
}
