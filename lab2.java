package main;
import java.util.Scanner;
import java.util.Random;

public class lab2 {

	public static void main(String[] args){
		
		Scanner reader= new Scanner(System.in);
		
		 //1.
		
		 while (true) {
			System.out.println("Enter the password: ");
			String guess= reader.nextLine();
			if (guess.equals("carrot")){
				System.out.println("Correct!");
				break;
			}
			System.out.println("Guess again!");
		}
		
		//2.
		
		int sum=0;
		int read;
		int i=0;
		while(i<3) {
			System.out.println("Type in your number: ");
			read=Integer.parseInt(reader.nextLine());
			sum+=read;
			i++;
		}
		System.out.println("Sum: "+ sum); 
		
		//3.
		
		int sum1=0;
		int read1;
		int j=0;
		while(true) {
			System.out.println("Type in your number: ");
			read1=Integer.parseInt(reader.nextLine());
			if (read1==0) {
				break;
			}
			sum1+=read1;
			;
		}
		System.out.println("Sum: "+ sum1); 
		
		//4.
		
		System.out.println("Enter the starting number: ");
		int firstnumber=Integer.parseInt(reader.nextLine());
		System.out.println("Enter the last number: ");
		int secondnumber=Integer.parseInt(reader.nextLine());
		
		if (secondnumber>firstnumber) {
			while(firstnumber<secondnumber-1) {
				System.out.println(firstnumber+1);
				firstnumber++;
			}
		} 
		
		//5.
		
		System.out.println("Enter the power: ");
		int pow=Integer.parseInt(reader.nextLine());
		int sum2=0;
		int k=0;
		while(k<=pow) {
			sum2+=Math.pow(2, k);
			k++;
		}
		System.out.println("Sum: "+ sum2); 
		
		//6.
		
		printText();
		printText(); 
		
		//7.
		
		printStars(3);
		printStars(6);
		printStars(11); 
		
		//8.
		
		Random rand=new Random();
		int randnum=rand.nextInt(100);
		int counter=0;
		
		while (true) {
			counter++;
			System.out.println("Guess a number: ");
			int guess=Integer.parseInt(reader.nextLine());
			if(guess==randnum) {
				System.out.println("Congratulations! Your number is correct!");
				System.out.println("Attempts: "+ counter);
				break;
			}
			if(guess>randnum) {
				System.out.println("The number is lesser!");
			}
			if(guess<randnum) {
				System.out.println("The number is greater!");
			}
			System.out.println("Attempts: "+ counter);
		}
		
	}
		//6.
		
		public static void printText() {
		System.out.println("In the beginning there were the swamp, the hoe and Java.");
		System.out.println("\n");
			}
		
		//7.
		private static void printStars(int amount) {
			int f=0;
			while(f<amount) {
				System.out.print("*");
				f++;
			}
			System.out.println("\n");
		}
		
}
