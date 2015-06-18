package leetcode;
import java.util.Arrays;
public class VersionNumber {
	public int compareVersion(String version1, String version2) {
		String[] token1 = version1.split("[.]");
		String[] token2 = version2.split("[.]");
		System.out.println(Arrays.toString(token1));
		System.out.println(Arrays.toString(token2));
		for (int i = 0; i < Math.max(token1.length, token2.length); i++){
			int num1, num2;
			if (i >= token1.length) num1 = 0;
			else num1 = Integer.parseInt(token1[i]);
			if (i >= token2.length) num2 = 0;
			else num2 = Integer.parseInt(token2[i]);
			if (num1 > num2) return 1;
			if (num1 < num2) return -1;
		}
		return 0;
		
    }
	//test
	public static void main(String[] args){
		String version1 = "13.37";
		String version2 = "15.24";
		String version3 = "1.0";
		String version4 = "1";
		VersionNumber solution = new VersionNumber();
		int a = solution.compareVersion(version1, version2);
		int b = solution.compareVersion(version1, version3);
		int c = solution.compareVersion(version2, version3);
		int d = solution.compareVersion(version3, version4);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
