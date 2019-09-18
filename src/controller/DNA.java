package controller;
import java.util.ArrayList;
import processing.core.*;

public class DNA {
	ArrayList<PVector> genes;//new vector forces sequencing
	
	DNA() {
		genes = new ArrayList();
		this.addVector(200);
	}
	
	private void addVector(int lifeSpan) {
		for (int i = 0; i < lifeSpan; i++) {//iterate through whole length of gene
			genes.add(PVector.random2D());//supply random force vectors to genes
		}
		
	}
	
}
