package com.cubic.oopsassignment2;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class CheckOut {
	static String type;
	static String namep;
	static double wtp;
	static String nameE;
	static int negg;
	static String nameS;
	static double costIC;
	static double costtop;
	
	static DecimalFormat f=new DecimalFormat("##.00");
	
	static Random rand = new Random();
    static double  a = rand.nextDouble()*3+1;
	static double b=rand.nextDouble()*2.5 + 1.5;

	static Potatoe p = new Potatoe(namep, wtp, a);
	static Egg e = new Egg(nameE, negg, b);
	static Sundae s = new Sundae(nameS, costIC, costtop);

	public static void costCalculatoin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any type of item from the list below:");
		System.out.println("Potato");
		System.out.println("Egg");
		System.out.println("Sundae");

		type = sc.nextLine();

		if (type.equalsIgnoreCase("Potato")) {
			p.methodP();
			System.out.println(p.toString()+" total cost: $"+f.format(p.getCost()));
			
		} else if (type.equalsIgnoreCase("Egg")) {
			e.methodE();
			System.out.println(e.toString()+" total cost: $" +f.format(e.getCost()));
			
		} else if (type.equalsIgnoreCase("Sundae")) {
			s.methodS();
			System.out.println(s.toString()+" total cost: $"+ f.format(s.getCost()));
			
		} else {
			throw new InputMismatchException();
		}
	}

	public static void main(String[] args) {

		while (true) {
			try {
				CheckOut.costCalculatoin();
				break;
			} catch (InputMismatchException e1) {
				System.out.println(" ****INVALID name type****");
			}

		}

	}
}
