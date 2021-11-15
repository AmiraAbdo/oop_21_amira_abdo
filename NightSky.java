package main;
import java.util.Random;

public class NightSky {
	
	private double density;
	private int width;
	private int height;
	private int starsInLastPrint=0;
	
	public NightSky(double density) {
		this.density=density;
		this.width=20;
		this.height=10;
	}
	
	public NightSky(int width, int height) {
		this.density=0.1;
		this.width=width;
		this.height=height;
	}
	
	public NightSky(double density, int width, int height) {
		this.density=density;
		this.width=width;
		this.height=height;
	}
	
	public void printLine() {
			for (int i=0; i<this.width;i++) {
			boolean val = new Random().nextDouble()<=this.density;
			if (val) {
				this.starsInLastPrint++;
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		
	}
	
	public void print() {
		for (int i=0; i<this.height; i++) {
			this.printLine();
			System.out.println("");
		}
	}
	
	public int starsInLastPrint() {
		return this.starsInLastPrint;
	}
}


