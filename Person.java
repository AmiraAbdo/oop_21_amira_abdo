
public class Person {
	
	private String Name;
	private int age;
	
	public Person(String name, int age) {
		if(name.length()>40 ||	name.length()==0 || name==null || (age<0 || age>120)) {
			throw new IllegalArgumentException("Not a valid person!");	
		}
		else {
			this.Name=name;
			this.age=age;
			System.out.println("OK!");
		}
	}
	
}
