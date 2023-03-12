
public class strLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(length("Hexaview Hires the Best"));
		int[] arr = {700000,100000,500000,300000};
		System.out.println(maxProfit(arr));

	}
	
	public static int length(String str) {
		
		String[] arr = str.split(" ");
		if(arr.length%2==0) {
			String word1 = arr[arr.length/2];
			String word2 = arr[arr.length/2-1];
			return Math.max(word1.length(), word2.length());
		}else {
			String word = arr[arr.length/2];
			return word.length();
		}
	}
	
	public static int maxProfit(int[] prices) {
		int tp = 0;      //total profit
        int pist = 0;    //profit if sold today
        
        int lsf = Integer.MAX_VALUE;   //least so far
        
        for(int i=0; i<prices.length; i++){
            if(prices[i]<lsf){
                lsf = prices[i];
            }
            
            pist = prices[i]-lsf;
            if(pist>tp){
                tp = pist;
            }
        }
        return (int)(0.1*tp);
	}

}
