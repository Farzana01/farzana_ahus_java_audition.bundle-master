package minesweeper;

public class Minesweeper {
	//setup
	int n = 5;
	int m = 5;
	String [][] board = new String[n][m];
	String mine = "*";
	
	
	public void build() {
		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[0].length; j++) {
		        	board[i][j] = ".";
		 System.out.print(board[i][j] + " ");
		}
		        System.out.println("");
		 }
	}
	

	public void addMines(int numMines) {
		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[0].length; j++) {
		       	 int randRow = (int)(Math.random()*numMines);
			     int randCol = (int)(Math.random()*numMines);
		        	if( i== randRow && j == randCol) {
		        		board[i][j] = "*";
		        			} else {
		                     board[i][j] = " . ";
		        }
		        	
		        }
		}
	
	}
	
	public void test() {
		System.out.println("this is a test. Delete once github is working");
	}
}