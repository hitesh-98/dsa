package array2D;

public class longestpalindromicSubString {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		String s = longestPalindrome("babad");

	}

	public static String longestPalindrome(String s) {
		boolean[][] dp = new boolean[s.length()][s.length()];

		int max = 1;
		int start = 0;
		for (int i = 0; i < dp.length; i++) // 1 length substring are palindrome
			dp[i][i] = true;

		for (int i = 0; i < dp.length - 1; i++) // 2 length substring
		{
			dp[i][i + 1] = s.charAt(i) == s.charAt(i + 1);
			if (dp[i][i + 1]) {
				max = 2;
				start = i;
			}
		}

		for (int len = 2; len < dp.length; len++) {
			for (int i = 0; i < dp.length - len; i++) {
				int j = i + len;
				if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - i] == true) {
					dp[i][j] = true;

					if (len > max) {
						max = len;
						start = i;
					}
				}
			}
		}

		return s.substring(start, start + max);

	}

}
