package leetcode;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if (strs.length == 0)
        	return prefix;
        for (int i = 0; i < strs[0].length(); i++){
        	for (int j = 1; j < strs.length; j++){
        		if (strs[j].length() < i + 1)
        			return prefix;
        		if (strs[0].charAt(i) != strs[j].charAt(i))
        			return prefix;
        	}
        	prefix += String.valueOf(strs[0].charAt(i));
        }
        return prefix;
    }
	//test
	public static void main(String[] args){
		String[] strs = {"abc", "ab", "abde", "abeg", "abde"};
		LongestCommonPrefix solution = new LongestCommonPrefix();
		String ans = solution.longestCommonPrefix(strs);
		System.out.println(ans);
	}
}
