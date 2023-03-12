package backtracking;

public class NQueens {

	public static void main(String[] args) {
		int n = 4;
		nQueens(new boolean[n][n], n, 0, 0, 0, "");
		nQueens2(new boolean[n][n], n, 0, 0, "");

	}

	public static void nQueens(boolean[][] chess, int tq, int qpsf, int row, int col, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
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
			nQueens(chess, tq, qpsf + 1, row + 1, 0, ans + "{" + row + "-" + col + "}");
			chess[row][col] = false;
		}

		nQueens(chess, tq, qpsf, row, col + 1, ans);
	}

	// another way
	public static void nQueens2(boolean[][] board, int tq, int qpsf, int row, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		for (int col = 0; col < board[0].length; col++) {

			if (isSafeCell(board, row, col)) {
				board[row][col] = true;
				nQueens2(board, tq, qpsf + 1, row + 1, ans + "{" + row + "-" + col + "}");
				board[row][col] = false;
			}
		}
	}

	public static boolean isSafeCell(boolean[][] board, int row, int col) {

		// vertically upward
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}

		// horizontally left
		r = row;
		c = col - 1;
		while (c >= 0) {
			if (board[r][c]) {
				return false;
			}
			c--;
		}

		// diagonally left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}

		// diagonally right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}

		return true;
	}

}
