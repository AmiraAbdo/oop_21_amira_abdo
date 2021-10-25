package main;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class lab3 {
	

	public static void main(String[] args) {
		
		//1.
		double answer=average(4,3,6,1);
		System.out.println("Average: "+ answer);
		
		//2.
		lengthofname();
		
		//3.
		chars();
		
		//4.
		reverse();
		
		//5.
		isitcontained(); 
		
		//6.
		samewordtwice(); 
		
		//7.
		ArrayList<String> mojalista= new ArrayList<String>();
		mojalista.add("Amira");
		mojalista.add("koko");
		mojalista.add("dscfvgbhnjmk");
		System.out.println(listoflengths(mojalista)); 
		
		//8.
		palindrome("madam");
		palindrome("flower");
		
		
		}
	
	
		//1.
	
	public static double average(int num1, int num2, int num3, int num4) {
		double avg= ((double)Integer.sum(Integer.sum(num1, num2), Integer.sum(num3, num4))/4);
		return avg;
	}
	
		//2.
	
		public static void lengthofname() {
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name= reader.nextLine();
		System.out.println(name.length());
	}
		
		//3.
		
		public static void chars() {
			Scanner reader= new Scanner(System.in);
			System.out.println("Enter your name: ");
			String name= reader.nextLine();
			int i=0;
			while(i<name.length()) {
				System.out.println(name.charAt(i));
				i++;
			}
		}
		
		//4.
		
		public static void reverse() {
			Scanner reader= new Scanner(System.in);
			System.out.println("Enter your name: ");
			String name= reader.nextLine();
			int i=name.length()-1;
			while(i>=0) {
				System.out.print(name.charAt(i));
				i--;
			}
		}
		
		//5.
		
		public static void isitcontained() {
			Scanner reader= new Scanner(System.in);
			System.out.println("Enter the first word: ");
			String word1= reader.nextLine();
			System.out.println("Enter the second word: ");
			String word2= reader.nextLine();
			if(word1.indexOf(word2)>=0) {
				System.out.println("It's contained!");
			}
			else {
				System.out.println("Nope!");
			}
		}
		
		//6.
		
		public static void samewordtwice() {
			int i=0;
			Scanner reader= new Scanner(System.in);
			ArrayList<String> wordlist= new ArrayList<String>();
			while (true){
				System.out.println("Enter your word: ");
				String word= reader.nextLine();
				for (String element : wordlist) {
					if (element.equals(word)) {
						i++;
						break;
					}
				}
				if(i>0) {
					System.out.println("That's it!");
					break;
				}
				wordlist.add(word);
			}
			Collections.sort(wordlist);
			for (String w: wordlist) {
				System.out.println(w);
			}
		}
		
		//7.
		
		public static ArrayList<Integer> listoflengths(ArrayList<String> oldlist){
			ArrayList<Integer> newlist= new ArrayList<Integer>();
			for ( String el1 : oldlist ) {
				newlist.add(el1.length());
			}
			return newlist;
		}
		
		//8.
		
		public static void palindrome(String word) {
			String newword= "";
			int i=word.length()-1;
			while (i>=0) {
				newword+=word.charAt(i);
				i--;
			}
			if (word.equals(newword)) {
				System.out.println("The word "+ word+ " is a palindrome!");
			}
			else {
				System.out.println("The word "+ word+ " is not a palindrome!");
			}
		}
}

