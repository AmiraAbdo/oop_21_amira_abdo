package application;

public class ConstantSensor implements Sensor{
	
	private int num;
	
	public ConstantSensor(int num) {
		this.num=num;
	}
	public void  on() {}
	public void off() {}
	public boolean isOn() { return true;}
	public int measure() {
		return this.num;
	}
	
}
