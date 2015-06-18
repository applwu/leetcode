package leetcode;

public class ATOI {
	public int atoi(String str){
		int output = 0;
		boolean isNegtive = false;
		if (str == "") return output;
		if (str.charAt(0) == '-' || str.charAt(0) == '+'){
			if (str.charAt(0) == '-') isNegtive = true;
			str = str.substring(1);
		}
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
				if (isNegtive){
					if (output < Integer.MIN_VALUE / 10) 
						return Integer.MIN_VALUE;
					if (output == Integer.MIN_VALUE / 10 && str.charAt(i) >= Integer.MIN_VALUE % 10)
						return Integer.MIN_VALUE;
					output = 0 - (output * 10 + Character.getNumericValue(str.charAt(i)));
				}
				else{
					if (output > Integer.MAX_VALUE / 10) 
						return Integer.MAX_VALUE;
					if (output == Integer.MAX_VALUE / 10 && str.charAt(i) >= Integer.MAX_VALUE % 10)
						return Integer.MAX_VALUE;
					output = output * 10 + Character.getNumericValue(str.charAt(i));
				}
			}
			else
				return output;
		}
		return output;
	}
	//test
	public static void main(String[] args){
		ATOI solution = new ATOI();
		String str = "";
		int output = solution.atoi(str);
		System.out.println(output);
		
	}
}
