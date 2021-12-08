package workspace;

public class lab{
	
	public static void main(String[] args) {
	CivilService s1= new CivilService();
	System.out.println(s1.getDaysLeft());
	s1.work();
	System.out.println(s1.getDaysLeft());
	
		MilitaryService m1= new MilitaryService(55);
		System.out.println(m1.getDaysLeft());
		m1.work();
		System.out.println(m1.getDaysLeft());
		
		Book book1= new Book("writer1", "name1", 2);
		System.out.println(book1);
		Book book2= new Book("writer2", "name2", 5.6);
		System.out.println(book2);
		CD cd1= new CD("artist1", "title1", 1999);
		
		Box box1= new Box(10);
		box1.add(book1);
		box1.add(book2);
		box1.add(cd1);
		
		System.out.println(box1);
		box1.add(new Book("writer3", "name3", 5));
		System.out.println(box1);
		
		Generic<Integer> int1= new Generic(10);
		Generic<String> string1= new Generic("Hello World");
		
		System.out.println(int1);
		System.out.println(string1);
}}
