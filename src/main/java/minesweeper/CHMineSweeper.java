package minesweeper;

import java.util.Scanner;

public class CHMineSweeper {

	public static void main(String[] args) {

		// taking user input and making sure that it is a positive number

		Scanner line = new Scanner(System.in);
		int m;
		int n;

		do {
		System.out.println("Please enter a number for rows.");
		n = line.nextInt();

		System.out.println("Please enter a number for columns.");
		m = line.nextInt();
				
		while (n < 0 || n > 100 && m < 0 || m > 100) {
			System.out.println("This is not a valid range. Please enter any nnumber between 1 and 100.");
			
			m = line.nextInt();
			n = line.nextInt();
			// line.next();
		}
		
		}while (m < 0);
		// System.out.println("You got it");
		
		// 2D array
       
		// creating dots
		String[][] array = new String[n][m];
		// loop to build rows
		for (int i = 0; i < array.length; i++) {
			// loop to build columns
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = ". ";
			}

		}
		// creating spaces
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
		line.close();
	} 

}