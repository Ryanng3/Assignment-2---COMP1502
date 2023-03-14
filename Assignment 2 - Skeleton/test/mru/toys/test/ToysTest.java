package mru.toys.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mru.toys.controller.ToyManager;
import mru.toys.model.Animals;
import mru.toys.model.Toys;

class ToysTest {
	ArrayList<Toys> toy = new ArrayList<>();
	Animals animalsTest = new Animals (2835360879L, "Cow", "Game Assassin", 19.52, 3, 7, "Plastic", 'M');
	
	@Test
	void serialNumber() {
		for(Toys t : toy) {
			t.setSerialNumber(2835360879L);
			assertEquals(2835360879L, t.getSerialNumber());
		}
	}
	
	@Test void Name() {
		for(Toys t : toy) {
			t.setName("Cow");
			assertEquals("Cow", t.getName());
		}
	}
}




