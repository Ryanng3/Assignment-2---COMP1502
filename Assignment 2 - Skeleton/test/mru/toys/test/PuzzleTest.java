package mru.toys.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import mru.toys.model.Puzzle;
import mru.toys.model.Toys;

class PuzzleTest {

	ArrayList<Toys> toy = new ArrayList<>();
	Puzzle puzzleTest = new Puzzle ("4863437054", "Logic puzzle", "Game Shadow", 265.62, 11, 4, 'T');
	
	@Test
	void serialNumber() {
		for(Toys i: toy) {
			i.setSerialNumber("4863437054");
			assertEquals("4863437054", i.getSerialNumber());
		}
	}
	
	@Test void name() {
		for(Toys i : toy) {
			i.setName("Logic puzzle");
			assertEquals("Logic puzzle", i.getName());
		}
	}
		
	@Test void brand() {
		for(Toys i : toy) {
		i.setBrand("Game Shadow");
		assertEquals("Game Shadow", i.getBrand());
		}
	}
}
