package leetcode;

public class ZigZag {
	public String convert(String s, int nRows) {
        //calculate matrix size
		int y = nRows;
		int x;
		if (y == 1) return s;
		if (s.length() % (2 * y - 2) <= y)
			x = (s.length() / (2 * y - 2)) * (y - 1) + 1;
		else
			x = (s.length() / (2 * y - 2)) * (y - 1) + s.length() % (2 * y - 2) - y + 1;
		
		char[][] matrix = new char[y][x];
		for (int i = 0, a = 0, b = 0; i < s.length(); i++){
			if (isEven(i / (y - 1))){
				matrix[a][b] = s.charAt(i);
				a++;
				}
			else{
				matrix[a][b] = s.charAt(i);
				a--;
				b++;
			}
		}
		char[] chars = new char[s.length()];
		int pos = 0;
		for (int i = 0; i < y; i++){
			for (int j = 0; j < x; j++){
				if (matrix[i][j] != '\u0000'){
					chars[pos] = matrix[i][j];
					pos++;
				} 
			}
		}
		String result = String.valueOf(chars);
		return result;
    }
	public boolean isEven(int a){
		if (a == 1) return false;
		else if (a % 2 != 0) return false;
		else return true;
	}
	//test
	public static void main(String[] args){
		String test = "PAYPALISHIRING";
		String expected = "PAHNAPLSIIGYIR";
		int nRows = 3;
		ZigZag solution = new ZigZag();
		String result = solution.convert(test, nRows);
		System.out.println(result);
		if (result.equals(expected)){
			System.out.print(true);
		}
		else{
			System.out.print(false);
		}
			
	}
}
