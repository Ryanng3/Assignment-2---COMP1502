package mru.toys.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.Test;
import mru.toys.model.Animals;
import mru.toys.model.Toys;

class AnimalTest {
	ArrayList<Toys> toy = new ArrayList<>();
	Animals animalsTest = new Animals ("2835360879", "Cow", "Game Assassin", 19.52, 3, 7, "Plastic", 'M');
	
	@Test
	void serialNumber() {
		for(Toys i: toy) {
			i.setSerialNumber("2835360879");
			assertEquals("2835360879", i.getSerialNumber());
		}
	}
	
	@Test void name() {
		for(Toys i : toy) {
			i.setName("Cow");
			assertEquals("Cow", i.getName());
		}
	}
	@Test void brand() {
		for(Toys i : toy) {
		i.setBrand("Game Assassin");
		assertEquals("Game Assassin", i.getBrand());
		}
	}
}




