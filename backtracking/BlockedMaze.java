package backtracking;

public class BlockedMaze {

	public static void main(String[] args) {
		int[][] board = {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,0,1,0}};
		blockedMaze(board,0,0,"",new boolean[board.length][board.length]);

	}
	
	public static void blockedMaze(int[][] board, int row, int col, String ans, boolean[][] visited) {
		
		if(row==board.length-1 && col==board.length-1) {
			System.out.println(ans);
			return;
		}
		
		if(row<0||row==board.length || col<0||col==board[0].length || board[row][col]==1||visited[row][col]) {
			return;
		}
		
		visited[row][col] = true;
		
		blockedMaze(board,row-1,col,ans+"T",visited);
		blockedMaze(board,row+1,col,ans+"D",visited);
		blockedMaze(board,row,col-1,ans+"L",visited);
		blockedMaze(board,row,col+1,ans+"R",visited);
		
		visited[row][col] = false;
	}

}
