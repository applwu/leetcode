package leetcode;

public class ImplementStrStr {
	public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();
        if (l2 == 0) return 0;
        for (int i = 0; i <= l1 - l2; i++){
        	for (int j = 0; j < l2; j++){
        		if (needle.charAt(j) != haystack.charAt(i + j))
        			break;
        		if (j == l2 - 1)
        			return i;
        	}
        	
        }
        return -1;
    }
	//test
	public static void main(String[] args){
		ImplementStrStr solution = new ImplementStrStr();
		String haystack = "ab";
		String needle = "b";
		System.out.println(solution.strStr(haystack, needle));
	}
}
