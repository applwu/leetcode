package leetcode;
public class ValidPalindrome {
	public boolean isValid(char c){
		if ((int)c <= 57 && (int) c >= 48)
			return true;
		if ((int)c <= 90 && (int)c >= 65)
			return true;
		if ((int)c <= 122 && (int)c >= 97)
			return true;
		return false;
	}
	public boolean isPalindrome(String s) {
		if (s.equals(""))
			return true;
		s = s.toLowerCase();
	    int i = 0;
	    int j = s.length() - 1;
	    while (i < j){
	    	while (!isValid(s.charAt(i))){
	    		i++;
	    		if (i == s.length())
	    			return false;
	    	}
	    	while (!isValid(s.charAt(j))){
	    		j--;
	    	}
	    	if (s.charAt(i) != s.charAt(j)){
	    		System.out.println(s.charAt(i) + "!=" + s.charAt(j));
	    		return false;
	    	}
    		System.out.println(s.charAt(i) + "=" + s.charAt(j));
	    	i++;
	    	j--;
	    }
	    return true;
	}
	public static void main(String[] args){
		String test = "A man, a plan, a canal: Panama";
		String test1 = ".,";
		ValidPalindrome solution = new ValidPalindrome();
		boolean ans = solution.isPalindrome(test);
		boolean ans1 = solution.isPalindrome(test1);
		System.out.println(ans);
		System.out.println(ans1);
	}
}
