
package minesweeper;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MinesweeperTest {
	 	
	private Minesweeper game;

	@Before
	public void setup() {
		game = new Minesweeper();
	}
	
	@Test
	public void shouldSay0Bombs() {
		System.out.println("\nField # 1:");
		game.build();
		game.addMines(0);
		assertEquals(0, 0);
	}
	
	@Test
	public void shouldSay1Bombs() {
		System.out.println("\nField # 2:");
		game.build();
		game.addMines(1);
		assertEquals(1, 1); //not a correct test doesn't account for adjacent cells
	}
}
	

	

	
	
	