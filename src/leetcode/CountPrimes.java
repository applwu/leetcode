package leetcode;

public class CountPrimes {
	public int countPrimes(int n) {
		if (n <= 1) return 0;
		if (n == 2) return 1;
		if (n <= 4) return 2;
		int ans = 2;
		for (int i = 5; i <= n; i++){
			int count = 0;
			for (int j = 2; j <= Math.sqrt(i); j++){
				if (i % j == 0){
					count++;
				}
			}
			if (count == 0){
				ans++;
			}
		}
		return ans;
    }
	public static void main(String[] args){
		CountPrimes solution = new CountPrimes();
		System.out.println(solution.countPrimes(20000000));
	}
}
