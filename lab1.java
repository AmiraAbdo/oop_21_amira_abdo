package main;
import java.util.Scanner;

public class lab1 {

	public static void main(String[] args) {
		// 1.
		System.out.println("Amira Abdo");
		
		//2.
		System.out.println("Hello World!");
		System.out.println("(And all the people of the world)");
		
		//3.
		int secondsinayear= 365*24*60*60;
		System.out.println("There are "+ secondsinayear+ " seconds in a year.");
		
		//4.
		Scanner reader= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int firstnumber=Integer.parseInt(reader.nextLine());
		System.out.println("Enter another number: ");
		int secondnumber=Integer.parseInt(reader.nextLine());
		System.out.println("The sum of the two numbers is "+ (firstnumber+secondnumber));
		
		//5.
		System.out.println("Enter a number: ");
		int number=Integer.parseInt(reader.nextLine());
		if (number>0) {
			System.out.println("The number is positive!");
		}
		else if (number<0) {
			System.out.println("The number is negative!");
		}
		else {
			System.out.println("The number must be 0");
		}
		
		//6.
		System.out.println("Enter a number: ");
		int number1=Integer.parseInt(reader.nextLine());
		System.out.println("Enter another number: ");
		int number2=Integer.parseInt(reader.nextLine());
		
		if (number1>number2){
			System.out.println(number1+" is greater!");
		}
		else if (number2>number1){
			System.out.println(number2+" is greater!");
		}
		else {
			System.out.println("They must be equal!");
		}
	
	}

}
