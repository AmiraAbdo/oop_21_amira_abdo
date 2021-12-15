package application;
import java.util.Random;

public class Thermometer implements Sensor {
	
	private boolean isOn= false;
	
	public void on() {
		this.isOn=true;
	}
	
	public void off() {
		this.isOn=false;
	}
	
	public boolean isOn() {
		if (this.isOn) return true;
		else return false;
	}
	
	public int measure() {
		if(this.isOn()) {
			Random r= new Random();
			return r.nextInt(-30,31);	
		}
		else throw new IllegalStateException("It's not on!");
	}
	
	
	
}
