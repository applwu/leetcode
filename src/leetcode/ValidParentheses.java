package leetcode;

import java.util.LinkedList;
public class ValidParentheses{
    public boolean isValid(String s){
        LinkedList<Character> stack = new LinkedList<Character>();
		for (int i = 0; i < s.length(); i++){
			char item = s.charAt(i);
			if (item == '(' || item == '[' || item == '{'){ 
					stack.push(item); 
			}
			else if (item == ')' || item == ']' || item == '}'){
					if (stack.size() == 0)
						return false;
					char previous = stack.peek();
					if (!isMatch(previous, item))
						return false;
					else
						stack.pop();
			}
			else{
				return false;
			}
		}
		if (stack.size() == 0) return true;
		return false;
    }
	private boolean isMatch(char a, char b){
			if (a == '(' && b == ')') 
			    return true;
			else if (a == '[' && b == ']') 
				return true;
			else if (a == '{' && b == '}') 
			    return true;
			else
				return false;
	}
	//test
	public void test(String s){
		if (isValid(s)) 
			System.out.println(s + " is valid");
		else
			System.out.println(s + " is not valid");
	}
	public static void main(String args[]){
		ValidParentheses solution = new ValidParentheses();
		String s1 = "([{)]}";
		String s2 = "([{}]}";
		String s3 = "{}[]()[]";
		solution.test(s1);
		solution.test(s2);
		solution.test(s3);
	}
}
