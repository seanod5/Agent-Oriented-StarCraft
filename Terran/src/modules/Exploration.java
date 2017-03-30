package modules;

import java.util.ArrayList;
import java.util.Random;

import astra.core.Module;
import astra.term.ListTerm;
import astra.term.Primitive;

// Module containing methods regarding map exploration in StarCraft

public class Exploration extends Module {
	
	private Random rand = new Random();
	private static ArrayList<Integer> basesX = new ArrayList<Integer>();
	private static ArrayList<Integer> basesY = new ArrayList<Integer>();
	
	// Base locations
	@ACTION
	public boolean addBase(int x, int y) {
		basesX.add(x);
		basesY.add(y);
		return true;
	}
	
	@TERM
	public ListTerm getRandomBase() {
		ListTerm coords = new ListTerm();
		int random = rand.nextInt(basesX.size());
		coords.add(Primitive.newPrimitive(basesX.get(random)));
		coords.add(Primitive.newPrimitive(basesY.get(random)));
		basesX.remove(random);
		basesY.remove(random);
		return coords;
	}
}
