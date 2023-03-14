package mru.toys.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import mru.toys.model.BoardGames;
import mru.toys.model.Toys;

class BoardGamesTest {

	ArrayList<Toys> toy = new ArrayList<>();
	BoardGames boardGame = new BoardGames ("7734720369",  "Doom: The Boardgame", "Gamefluent", 174.24,  10, 7, "2-5", "Miller Knights");
	
	@Test
	void serialNumber() {
		for(Toys i: toy) { 
			i.setSerialNumber("7734720369");
			assertEquals("7734720369", i.getSerialNumber());
		}
	}
	
	@Test void name() {
		for(Toys i : toy) { 
			i.setName("Doom: The Boardgame");
			assertEquals("Doom: The Boardgame", i.getName());
		}
	}
		
	@Test void brand() {
		for(Toys i : toy) {
		i.setBrand("Gamefluent");
		assertEquals("Gamefluent", i.getBrand());
		}
	}

}
