package leetcode;

public class IntegerToRoman {
	public String intToRoman(int num) {
		if (num > 3999 || num <= 0) return "Invalid";
        String[] symbol = {"I","V","X","L","C","D","M"};
        String roman = "";
        int range = 1000;
        for (int i = 6; i >= 0; i -= 2){
        	int digit = num / range;
        	if (digit != 0){
        		if (digit <= 3){
        			for (int j = 0; j < digit; j++)
        				roman += symbol[i];
        		}
        		else if (digit == 4){
        			roman += symbol[i];
        			roman += symbol[i+1];
        		}
        		else if (digit == 5){
        			roman += symbol[i+1];
        		}
        		else if (digit <= 8){
        			roman += symbol[i+1];
        			for (int j = 0; j < digit - 5; j++)
        				roman += symbol[i];
        		}
        		else if (digit == 9){
        			roman += symbol[i];
        			roman += symbol[i+2];
        		}
        	}
        	num = num % range;
        	range = range / 10;
        }
        return roman;
    }
}
