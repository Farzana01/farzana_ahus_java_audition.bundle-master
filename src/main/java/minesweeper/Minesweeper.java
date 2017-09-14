package minesweeper;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Minesweeper {

	public static void main(String[] args) {
	    int n = 5;
	    int m = 5;
	  
	    
	    int mines = 5;
	    
	    String [][] board = new String[n][m];
	    
	    while(mines != 0) {
	    	 int randRow = (int)(Math.random()*n);
		     int randCol = (int)(Math.random()*m);
		     
	    for (int i = 0; i < board.length; i++) {
	        for (int j = 0; j < board[0].length; j++) {
	        	if(mines>0 && i==randRow && j==randCol) {
	        		board[i][j] = "*";
	        		mines--;
	        		randRow = (int)(Math.random()*n);
	    		    randCol = (int)(Math.random()*m);
	        	} else {
	                     board[i][j] = " . ";

	        	}
	        }
	    }
	    
	    }
	    //prints the game board
	    for (int i = 0; i < board.length; i++) {
	        for (int j = 0; j < board[0].length; j++) {
	       
	           System.out.print(board[i][j] + " ");
	        }
	        System.out.println("");
	    }
	}
}

