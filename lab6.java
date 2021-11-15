package main;
import java.util.Arrays;
import java.util.ArrayList;

public class lab6 {
	
	public static void main(String[] args) {
		
		int[] values= {6, 7, 11, 5, 8};
		System.out.println("The smallest in the list is: "+ smallest(values));
		System.out.println("The index of the smallest element in the list is: "+ indexOfTheSmallest(values));
		System.out.println(indexOfTheSmallestStartingFrom(values, 2));
		
		System.out.println(Arrays.toString(values));
		swap(values, 1,3);
		System.out.println(Arrays.toString(values));
		
		printElegantly(values);
		System.out.println("\n");
		
		NightSky sky1= new NightSky(0.1, 20, 20);
		
		sky1.print();
		System.out.println(sky1.starsInLastPrint());
		sky1.print();
		System.out.println(sky1.starsInLastPrint()); 
		
		Library Library= new Library();
		
	 	Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
		Library.addBook(new Book("The Stinky Cheeseman and Other Fairly Stupid Tales", "Penguin Group", 1992));
		Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
		Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952)); 
		
		
		
		for (Book book: Library.searchByTitle("CHEESE")) {
			System.out.println(book);
		}
		System.out.println("---");
		
		for (Book book: Library.searchByPublisher("PENGUIN  ")) {
			System.out.println(book);
		}
		
		
	}
	
	public static int smallest(int[] array) {
		int min=array[0];
		for(int i=1; i<array.length; i++) {
			if (array[i]<min) {
				min=array[i];
			}
		}
		return min;
	}
	
	public static int indexOfTheSmallest(int[] array) {
		int min=array[0];
		int indexofsmallest=0;
		for(int i=1; i<array.length; i++) {
			if (array[i]<min) {
				min=array[i];
				indexofsmallest=i;
			}
		}
		return indexofsmallest;
	}
	
	public static int indexOfTheSmallestStartingFrom(int[] array, int startindex) {
		int min=array[startindex];
		int indexofsmallest=startindex;
		for(int i=startindex+1; i<array.length; i++) {
			if (array[i]<min) {
				min=array[i];
				indexofsmallest=i;
			}
		}
		return indexofsmallest;
	}
	
	public static void swap(int[] array, int ind1, int ind2) {
		int holder= array[ind1];
		array[ind1]=array[ind2];
		array[ind2]= holder;
	}

	public static void printElegantly(int[] array) {
		for(int i=0; i<array.length-1;i++) {
			System.out.print(array[i]+ ", ");
		}
		System.out.print(array[array.length-1]);
	}
	
}
