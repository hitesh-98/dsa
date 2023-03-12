package DP;

public class MazePath {

	public static void main(String[] args) {
		int n = 20000;
		//System.out.println(mazePathRecursive(0,0,n,n));
		//System.out.println(mazePathTopDown(0,0,n,n,new int[n+1][n+1]));
		System.out.println(mazePathBottomUp(n,n));

	}
	
	public static int mazePathRecursive(int cr, int cc, int er, int ec) {
		
		if(cr==er || cc==ec)
			return 1;
		
		if(cr>er || cc>ec)
			return 0;
		
		int cv = mazePathRecursive(cr+1,cc,er,ec);
		int ch = mazePathRecursive(cr,cc+1,er,ec);
		
		return ch+cv;
		
	}
	
	public static int mazePathTopDown(int cr, int cc, int er, int ec, int[][] strg) {
		
		if(cr==er || cc==ec)
			return 1;
		
		if(cr>er || cc>ec)
			return 0;
		
		//re-use
		if(strg[cr][cc]!=0)
			return strg[cr][cc];
		
		int ch = mazePathTopDown(cr,cc+1,er,ec,strg);
		int cv = mazePathTopDown(cr+1,cc,er,ec,strg);
		
		//store computed values
		strg[cr][cc] = ch+cv;
		
		return ch+cv;
	}
	
	public static int mazePathBottomUp(int er, int ec) {
		
		int[][] strg = new int[er+2][ec+2];
		
		for(int row=er; row>=0; row--) {
			
			for(int col=ec; col>=0; col--) {
				
				if(row==er&&col==ec)
					strg[row][col] = 1;
				
				else {
					strg[row][col] = strg[row][col+1] + strg[row+1][col];
				}
			}
		}
		
		return strg[0][0];
	}

}
