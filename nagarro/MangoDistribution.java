package nagarro;

public class MangoDistribution {

	public static void main(String[] args) {
		System.out.println(countWays(7,5));

	}

	public static int countWays(int items, int people) {

		int m = people-1;
		int n = items + people - 1;
		
		int res = 1;
		
		if (m > n - m) {
			m = n - m;
		}

		for (int i = 0; i < m; i++) {
			res *= (n - i);
			res /= (i + 1);
		}

		return res;
	}

}
