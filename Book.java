package workspace;

public class Book implements ToBeStored {

	private String writer;
	private String name;
	private double weight;
	
	public Book(String w, String n, double we) {
		this.writer=w;
		this.name= n;
		this.weight= we;
	}
	
	public double weight() {
		return this.weight;
	}
	
	public String toString() {
		return(this.writer+ ": "+ this.name);
	}
}
