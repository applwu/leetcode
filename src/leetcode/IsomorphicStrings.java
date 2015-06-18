package leetcode;

import java.util.Hashtable;

public class IsomorphicStrings {
	public boolean dcheck(String s, String t) {
		Hashtable<Character, Character> ht1 = new Hashtable<Character, Character>();
		for (int i = 0; i < s.length(); i++){
			if (!ht1.containsKey(s.charAt(i))){
				ht1.put(s.charAt(i), t.charAt(i));
			}
			else
			{
				char c = ht1.get(s.charAt(i));
				if (c != t.charAt(i))
					return false;
			}
		}
		return true;
	}

	public boolean isIsomorphic(String s, String t) {
		if (s.equals("") && t.equals(""))
			return true;
		if (s.length() != t.length())
			return false;
		if (dcheck(s,t) && dcheck(t,s))
			return true;
		return false;
	}
	public static void main(String[] args){
		
		IsomorphicStrings solution = new IsomorphicStrings();
		String s = "ab";
		String t = "aa";
		System.out.println(solution.isIsomorphic(s, t));
		//Hashtable<Character, Character> ht = new Hashtable<Character, Character>();
		//ht.put('o', 'a');
		//System.out.println(ht.containsKey('o'));
	}
}
