package backtracking;

public class NKnights {

	static int count = 0;
	public static void main(String[] args) {
		int n = 3;
		nKnights(new boolean[n][n], n, 0, 0, 0, "");
		System.out.println(count);

	}

	public static void nKnights(boolean[][] chess, int tk, int kpsf, int row, int col, String ans) {

		if (kpsf == tk) {
			System.out.println(ans);
			count++;
			return;
		}

		if (col == chess[0].length) {
			row++;
			col = 0;
		}

		if (row == chess.length) {
			return;
		}

		if (isSafeCell(chess, row, col)) {
			
			chess[row][col] = true;
			nKnights(chess, tk, kpsf + 1, row , col+1, ans+"{"+row+"-"+col+"}");
			chess[row][col] = false;
		}

		nKnights(chess, tk, kpsf, row, col + 1, ans);
	}

	public static boolean isSafeCell(boolean[][] board, int row, int col) {

		int[] rowArr = {-1,-2,-2,-1};
		int[] colArr = {2,1,-1,-2};
		for(int i=0; i<4; i++) {
			int r = row+rowArr[i];
			int c = col+colArr[i];
			
			if (r>=0&&r<board.length && c>=0&&c<board[0].length) {
				
				if(board[r][c]) {
					return false;
				}
			}
		}
		
		return true;
		
		
//		int r = row-2;
//		int c = col+1;
//		if (r>=0&&r<board.length && c>=0&&c<board[0].length && board[r][c]) {
//			return false;
//		}
//
//		r = row-1;
//		c = col+2;
//		if (r>=0&&r<board.length && c>=0&&c<board[0].length && board[r][c]) {
//			return false;
//		}
//
//		r = row - 1;
//		c = col - 2;
//		if (r>=0&&r<board.length && c>=0&&c<board[0].length && board[r][c]) {
//			return false;
//		}
//
//		r = row - 2;
//		c = col - 1;
//		if (r>=0&&r<board.length && c>=0&&c<board[0].length && board[r][c]) {
//			return false;
//		}

//		return true;
	}

}
