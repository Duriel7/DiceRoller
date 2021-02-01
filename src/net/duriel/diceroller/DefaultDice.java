package net.duriel.diceroller;

import java.util.Random;

public class DefaultDice {

	private Random random;
	
	public DefaultDice() {
		this.random = new Random();
	}
	
	public int Die6() {
		return random.nextInt(6) + 1;
	}
	
	public int Die10() {
		return random.nextInt(10) + 1;
	}
	
	public int Die20() {
		return random.nextInt(20) + 1;
	}
	
	public int Die100() {
		return random.nextInt(100) + 1;
	}
	

}
