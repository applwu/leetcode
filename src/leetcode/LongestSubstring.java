package leetcode;
import java.util.HashMap;
public class LongestSubstring {
	//hashtable
	public int lengthOfLongestSubstring(String s){
		if (s.length() == 0) return 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int ans = 0;
		//set j to be pointer points to start of substring.
		int j = 0;
		for (int i = 0; i < s.length(); i++){
			char current = s.charAt(i);
			if (map.containsKey(current)){
				j = Math.max(j, map.get(current)+1);
			}
			map.put(current, i);
			ans = Math.max(ans, i - j + 1);
		}
		return ans;
	}
	//test
	public void test(String s){
		System.out.println(s);
		System.out.println(lengthOfLongestSubstring(s));
	}
	public static void main(String[] args){
		String s = "abcdegasdfwefsjadifjoaiwjefi";
		LongestSubstring solution = new LongestSubstring();
		solution.test(s);
	}
}
