package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueensLeetcode {

	public static void main(String[] args) {
		int n = 4;
		List<List<String>> list = new ArrayList<>();
		String[] print = new String[n];
		Arrays.fill(print, ".");
		nQueens(new boolean[n][n], n, 0, 0, 0, list, new ArrayList<>(), print);
		System.out.println(list);
	}

	public static void nQueens(boolean[][] chess, int tq, int qpsf, int row, int col, List<List<String>> list,
			List<String> temp, String[] print) {

		if (qpsf == tq) {
			list.add(new ArrayList<>(temp));
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
			print[col] = "Q";
			temp.add(Arrays.toString(print));
			print[col] = ".";

			nQueens(chess, tq, qpsf + 1, row + 1, 0, list, temp, print);

			chess[row][col] = false;
			
			temp.remove(temp.size() - 1);
		}

		nQueens(chess, tq, qpsf, row, col + 1, list, temp, print);
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
