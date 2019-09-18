package controller;
import java.util.ArrayList;

import model.Guppy;

public class Population {
	ArrayList<Guppy> guppies;
	// construct array of fish
	public Population() {
		guppies = new ArrayList<Guppy>();
	}

	// call fish run method for each in array
	public int run(float aC, float cC, float sC, float fC, int pullDist, int desiredSep) {
		int popSize = 0; 
		for (Guppy g : guppies) {
			g.run(guppies, aC, cC, sC, fC, pullDist, desiredSep);
			popSize++;
		}
		return popSize;
	}

	// method to add guppies to array
	public void addGuppy(Guppy g) {
		guppies.add(g);
	}
}
