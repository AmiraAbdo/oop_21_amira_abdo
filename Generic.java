package workspace;

public class Generic<T>{
	
	private T value;
	public Generic(T v) {
		this.value= v;
	}
	
	public T getValue() {
		return this.value;
	}
	
	public String toString() {
		if(this.value.getClass()==Integer.class) {
		return("Integer value: "+ this.value);
	}
		else return("String value: "+ this.value);
	}
}
