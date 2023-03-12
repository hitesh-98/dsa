package backtracking;

import java.util.Arrays;

public class coinCombinationNoDuplicates {

	public static void main(String[] args) {
		int[] coin = {2,2,2,4};
		Arrays.sort(coin);
		userRespect(coin,6,0,"");
		System.out.println();
		coinRespect(coin,6,0,"",true);

	}
	
	public static void userRespect(int[] coin, int amount, int vidx, String ans) {
		
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		
		if(amount<0) {
			return;
		}
		
		for(int i=vidx; i<coin.length; i++) {
			if(i>vidx && coin[i]==coin[i-1]) {
				continue;
			}
			
			userRespect(coin, amount-coin[i], i+1, ans+coin[i]);
		}
	}
	
	public static void coinRespect(int[] coin, int amount, int vidx, String ans, boolean flag) {
		
		if(amount ==0) {
			System.out.println(ans);
			return ;
		}
		
		if(amount<0 || vidx==coin.length) {
			return;
		}
		
		if(flag==false && coin[vidx]==coin[vidx-1]) {
			coinRespect(coin, amount, vidx+1, ans, false);
		}
		else {
			coinRespect(coin, amount-coin[vidx], vidx+1, ans+coin[vidx], true);
			coinRespect(coin, amount, vidx+1, ans, false);
		}
	}

}
