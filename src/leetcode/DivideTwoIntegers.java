package leetcode;

public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
		int flag = 1;
		if (divisor == 0) 
			return Integer.MAX_VALUE;
		if (dividend < 0) {
			dividend = - dividend;
			flag = - flag;
		}
		if (divisor < 0) {
			divisor = - divisor;
			flag = - flag;
		}
        int result = getResult(dividend, divisor, 0);
        if (flag > 0) return result;
        else return - result;
    }
	public int getResult(int dividend, int divisor, int result){
		if (dividend < divisor)
			return result;
		result++;
		int cur = 0, res = 0;
		 while((divisor << cur) >= dividend && divisor << cur < 0 && cur < 31) cur++;
	        res = dividend - (divisor << cur-1);
	        if(res > divisor) return 1 << cur-1;
	        return (1 << cur-1)+divide(res, divisor);
	}
	//test
	public static void main(String[] args){
		DivideTwoIntegers solution = new DivideTwoIntegers();
		System.out.println(solution.divide(2147483647, 1000000));
	}
}
