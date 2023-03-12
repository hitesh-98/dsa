package backtracking;

public class coinCombinationsInfiniteSupply {

	public static void main(String[] args) {
		int[] coin = {1,2,3};
		userRespect(coin,5,0,"");
		System.out.println();
		coinRespect(coin,5,0,"");

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
			userRespect(coin, amount-coin[i], i, ans+coin[i]);
		}
	}
	
	public static void coinRespect(int[] coin, int amount, int vidx, String ans) {
		
		if(amount==0) {
			System.out.println(ans);
			return;
		}
			
		if(vidx==coin.length || amount<0) {
			return;
		}
		
		coinRespect(coin, amount, vidx+1, ans);
		coinRespect(coin, amount-coin[vidx], vidx, ans+coin[vidx]);
		
	}

}
