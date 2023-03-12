package DP;

public class MazePathDiagonal {

	public static void main(String[] args) {
		int n = 3000;
		//System.out.println(mazePathDiagonalRecursive(0,0,n,n));
		//System.out.println(mazePathDiagonalTD(0,0,n,n, new int[n+1][n+1]));
		System.out.println(mazePathDiagonalBU(n,n));

	}
	
	public static int mazePathDiagonalRecursive(int cr, int cc, int er, int ec) {
		
		if(cr==er && cc==ec)
			return 1;
		
		if(cr>er || cc>ec)
			return 0;
		
		int cv = mazePathDiagonalRecursive(cr+1,cc,er,ec);
		int ch = mazePathDiagonalRecursive(cr,cc+1,er,ec);
		int cd = mazePathDiagonalRecursive(cr+1,cc+1,er,ec);
		
		return cv+ch+cd;
		
	}
	
	public static int mazePathDiagonalTD(int cr, int cc, int er, int ec, int[][] strg) {
		
		if(cr==er && cc==ec)
			return 1;
		
		if(cr>er || cc>ec)
			return 0;
		
		if(strg[cr][cc]!=0)
			return strg[cr][cc];
		
		int cv = mazePathDiagonalTD(cr+1,cc,er,ec,strg);
		int ch = mazePathDiagonalTD(cr,cc+1,er,ec,strg);
		int cd = mazePathDiagonalTD(cr+1,cc+1,er,ec,strg);
		
		//store computed values
		strg[cr][cc] = ch+cv+cd;
		
		return cv+ch+cd;
	}
	
	public static int mazePathDiagonalBU(int er, int ec) {
		
		int[][] strg = new int[er+2][ec+2];
		
		for(int row=er; row>=0; row--) {
			
			for(int col=ec; col>=0; col--) {
				
				if(row==er&&col==ec)
					strg[row][col] = 1;
				
				else {
					strg[row][col] = strg[row+1][col]+strg[row][col+1]+strg[row+1][col+1];
				}
			}
		}
		
		return strg[0][0];
	}

}
