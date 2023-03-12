package nagarro;

public class longestPalindromicSubstring {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("babad"));

	}
	
	 public static String longestPalindrome(String s) {
	        boolean[][] dp = new boolean[s.length()][s.length()];
	        
	        int max = 1;
	        int start = 0;
	        for(int i=0; i<dp.length; i++)   //1 length substring are palindrome
	            dp[i][i] = true;
	        
	        for(int i=0; i<dp.length-1; i++)  //2 length substring
	        {
	            dp[i][i+1] = s.charAt(i)==s.charAt(i+1);
	            if(dp[i][i+1]){
	                max = 2; 
	                start = i;
	            }
	        }
	        
	        for(int len=2; len<dp.length; len++)
	        {
	            for(int i=0; i<=dp.length-len-1; i++)
	            {
	                int j=i+len;
	                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
	                    dp[i][j] = true;
	                }
	                else{
	                    dp[i][j] = false;
	                }
	                
	                if(dp[i][j]){
	                    max = len+1;
	                    
	                    if(len>max) {
	                    	start = i;
	                    }
	                }
	            }
	        }
	        
	        return s.substring(start,max);
	        
	    }
	}


