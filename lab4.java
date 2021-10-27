package main;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class lab4 {
	
	public static void main(String[] args) {
		
	/*	Dice dice1= new Dice(6);
		System.out.println(dice1);
		
		int i=0;
		while(i<10) {
			System.out.println(dice1.roll());
			i++;
		}
		
		LyyraCard card1=new LyyraCard(50);
		System.out.println(card1);
		card1.payEconomical();
		System.out.println(card1);
		card1.payGourmet();
		System.out.println(card1);
		
		LyyraCard card2= new LyyraCard(5);
		System.out.println(card2);
		card2.payGourmet();
		System.out.println(card2);
		card2.payEconomical();
		System.out.println(card2);
		
		card2.loadMoney(100);
		System.out.println(card2);
		card2.loadMoney(100);
		System.out.println(card2);
		
		card2.loadMoney(-50);
		System.out.println(card2); */
		
		LyyraCard pekkacard= new LyyraCard(20);
		LyyraCard briancard= new LyyraCard(30);
		pekkacard.payGourmet();
		briancard.payEconomical();
		System.out.println("Pekka: "+ pekkacard);
		System.out.println("Brian: "+ briancard);
		pekkacard.loadMoney(20);
		briancard.payGourmet();
		System.out.println("Pekka: "+ pekkacard);
		System.out.println("Brian: "+ briancard);
		pekkacard.payEconomical();
		pekkacard.payEconomical();
		briancard.loadMoney(50);
		System.out.println("Pekka: "+ pekkacard);
		System.out.println("Brian: "+ briancard);
		
		
	}

	public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
		first.addAll(second);
	}
	
}


