package backtracking;

public class ClassPractice {

	static int count = 0;

	public static void main(String[] args) {
//		boolean[] board = new boolean[4];
		// queenPermutations(board,0,4,"");

//		queenCombinationBoxRespect(board, 2, 0, "", 0);
//		System.out.println(count);

//		int[] arr = {2,3,5,6};
//		coinCombination(arr,0,10,"");
//		coinPermutation(arr,10,"");

		queenCombination2DKill(new boolean[3][4], 3, 0, 0, 0, "");
		System.out.println(count);
	}

	public static void queenPermutations(boolean[] board, int qpsf, int tq, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			count++;
			return;
		}

		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				queenPermutations(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ");
				board[i] = false;
			}
		}
	}

	public static void queenCombination(boolean[] board, int qpsf, int tq, String ans, int lastBoxUsed) {

		if (qpsf == tq) {
			System.out.println(ans);
			count++;
			return;
		}

		for (int i = lastBoxUsed + 1; i < board.length; i++) {
			board[i] = true;
			queenCombination(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i, i);
			board[i] = false;
		}
	}

	public static void coinCombination(int[] denom, int vidx, int target, String ans) {

		if (target == 0) {
			System.out.println(ans);
			count++;
			return;
		}
		if (target < 0 || vidx == denom.length) {
			return;
		}

		coinCombination(denom, vidx, target - denom[vidx], ans + denom[vidx]);
		coinCombination(denom, vidx + 1, target, ans);

	}

	public static void coinPermutation(int[] denom, int target, String ans) {

		if (target == 0) {
			System.out.println(ans);
			count++;
			return;
		}

		if (target < 0) {
			return;
		}

		for (int i = 0; i < denom.length; i++) {

			coinPermutation(denom, target - denom[i], ans + denom[i]);
		}
	}

	public static void queenCombinationBoxRespect(boolean[] board, int tq, int qpsf, String ans, int vidx) {

		if (qpsf == tq) {
			System.out.println(ans);
			count++;
			return;
		}

		if (vidx == board.length) {
			return;
		}

		board[vidx] = true;
		queenCombinationBoxRespect(board, tq, qpsf + 1, ans + "b" + vidx, vidx + 1);
		board[vidx] = false;

		queenCombinationBoxRespect(board, tq, qpsf, ans, vidx + 1);

	}

	public static void queenCombination2D(boolean[][] board, int tq, int qpsf, String ans, int row, int col) {

		if (qpsf == tq) {
			System.out.println(ans);
			count++;
			return;
		}

		if (col == board[0].length) {
			row++;
			col = 0;
		}

		if (row == board.length) {
			return;
		}

		board[row][col] = true;
		queenCombination2D(board, tq, qpsf + 1, ans + "{" + row + col + "}", row, col + 1);
		board[row][col] = false;

		queenCombination2D(board, tq, qpsf, ans, row, col + 1);

	}

	public static void queenCombination2DKill(boolean[][] board, int tq, int qpsf, int col, int row, String ans) {

		// +ve base case
		if (qpsf == tq) {
			System.out.println(ans);
			count++;
			return;
		}

		// change variables manually
		if (col == board[0].length) {
			row++;
			col = 0;
		}

		// -ve base case
		if (row == board.length) {
			return;
		}

		// place only if it is safe
		if (isSafeCell(board, row, col)) {
			board[row][col] = true;
			queenCombination2DKill(board, tq, qpsf + 1, col + 1, row, ans + "{" + row + col + "}");
			board[row][col] = false;
		}

		queenCombination2DKill(board, tq, qpsf, col + 1, row, ans);
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

		// horizontal left
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
			c--;
		}

		return true;

	}

}
