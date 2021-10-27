package main;
import java.util.Random;

public class Dice {
	private Random random;
	private int numberofsides;
	
	public Dice(int n) {
		this.numberofsides=n;
		this.random= new Random();
	}
	
	public String toString(){
		return ("The number of sides is "+ this.numberofsides);
	}
	
	public int roll() {
		return random.nextInt(this.numberofsides)+1;
	}

}
