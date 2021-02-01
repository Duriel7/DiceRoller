package net.duriel.diceroller;

import java.util.Random;

public class ChosenDice {
	
	private Random random;
	private int faces;
	
	public ChosenDice (int faces) {
		this.random = new Random();
		this.faces = faces;
	}
	
	public int roll() {
		return random.nextInt(faces) + 1;
	}

}
