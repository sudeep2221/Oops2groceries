package com.cubic.oopsassignment2;
import java.util.InputMismatchException;
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

	static Potatoe p = new Potatoe(namep, wtp, 2.30);
	static Egg e = new Egg(nameE, negg, 3.03);
	static Sundae s = new Sundae(nameS, costIC, costtop);

	public static void costCalculatoin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any type of item from the list below:");
		System.out.println("Potato");
		System.out.println("Egg");
		System.out.println("Sundae");

		type = sc.nextLine();

		if (type.equals("Potato")) {
			p.methodP();
			System.out.println("the total cost  of " + p.weightinpound + " pounds " + p.getName() + " is " + p.getCost()
					+ " in pound Sterling");
		} else if (type.equals("Egg")) {
			e.methodE();
			System.out.println("the total cost  of " + e.numofegg + " " + e.getName() + " is " + e.getCost()
					+ " in pound Sterling");
		} else if (type.equals("Sundae")) {
			s.methodS();
			System.out.println("the total cost  of " + s.getName() + " is " + s.getCost() + " in pound Sterling");
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
