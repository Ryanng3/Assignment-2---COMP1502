package mru.toys.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import mru.toys.model.Figures;
import mru.toys.model.Toys;

class FiguresTest {

	ArrayList<Toys> toy = new ArrayList<>();
	Figures figuresTest = new Figures ("1147205649", "Ninja Turtles", "Gamezoid", 46.15, 10,6, 'A');
	
	@Test
	void serialNumber() {
		for(Toys i: toy) {
			i.setSerialNumber("3066990646");
			assertEquals("3066990646", i.getSerialNumber());
		}
	}
	
	@Test void name() {
		for(Toys i : toy) {
			i.setName("Horse");
			assertEquals("Horse", i.getName());
		}
	}
		
	@Test void brand() {
		for(Toys i : toy) {
		i.setBrand("Gamescape");
		assertEquals("Gamescape", i.getBrand());
		}
	}

}
