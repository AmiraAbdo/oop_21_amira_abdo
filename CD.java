package workspace;

public class CD implements ToBeStored{

	private String artist;
	private String title;
	private int publishingYear;
	private double weight=0.1;
	
	public CD(String a, String t, int y) {
		this.artist=a;
		this.title= t;
		this.publishingYear= y;
	}
	
	public double weight() {
		return this.weight;
	}
	
	public String toString() {
		return(this.artist+ ": "+ this.title+ " ("+ this.publishingYear+ ")");
	}
}
