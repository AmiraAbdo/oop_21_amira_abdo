package workspace;
import java.util.HashMap;
import java.util.Set;


public class Storehouse {

	private HashMap<String, Integer> prices;
	private HashMap<String, Integer> stock;
	
	public Storehouse() {
		HashMap<String, Integer> prices= new HashMap<String, Integer>();
		HashMap<String, Integer> stock= new HashMap<String, Integer>();
	}
	
	public void addProduct(String product, int price, int stock) {
		this.prices.put(product, price);
		this.stock.put(product, stock);
	}
	
	public int price(String product) {
		if(this.prices.containsKey(product)){
			return this.prices.get(product);
		}
		else return -99;
}
	
	public int stock(String product) {
		if(this.stock.containsKey(product)){
			return this.stock.get(product);
		}
		else return 0;
	}
	
	public boolean take(String product) {
		if (this.stock(product)!=0){
			int value=this.stock.get(product);
			this.stock.put(product, value-1);
			return true;
		}
		else return false;
	}
	
	public Set<String> products(){
		Set<String> results= this.prices.keySet();
		return results;
	}
}









