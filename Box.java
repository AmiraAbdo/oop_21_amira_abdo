package workspace;

public class Box {
	
	private double maxWeight;
	private int numOfItems=0;
	private double currentWeight=0;
	
	public Box(double maxw) {
		this.maxWeight= maxw;
	}
	
	public void add(ToBeStored object) {
		if(this.currentWeight+object.weight()<this.maxWeight){
			this.currentWeight+=object.weight();
			this.numOfItems++;
		}
	}
	
	public String toString() {
		return("Items: "+ this.numOfItems+ ", weight: "+ this.currentWeight);
	}
}
