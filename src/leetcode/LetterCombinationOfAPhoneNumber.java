package leetcode;

import java.util.List;
import java.util.LinkedList;

public class LetterCombinationOfAPhoneNumber {
	private String[] keys = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

	public List<String> letterCombinations(String digits) {
		int digits_index = 0;
		String cur_str = "";
	    List<String> result = new LinkedList<String>();
	    getCombinations(digits, digits_index, result, cur_str);
	    return result;
	}
	
	public void getCombinations(String digits, int digits_index, List<String> result, String cur_str) {
		if (digits.length() == 0)
			return;
	    if (digits_index == digits.length()) {
	    	result.add(cur_str);
	        return;
	    }
	    int key_index = Integer.parseInt(String.valueOf(digits.charAt(digits_index))) - 2;
	    String key = keys[key_index];
	    for (int i = 0; i < key.length(); i++) {
	    	getCombinations(digits, digits_index + 1, result, cur_str + key.charAt(i));
	    }
	}

	//test
	public static void main(String[] args){
		String digits = "";
		LetterCombinationOfAPhoneNumber solution = new LetterCombinationOfAPhoneNumber();
		List<String> result = solution.letterCombinations(digits);
		System.out.println(result.toString());
	}
}
