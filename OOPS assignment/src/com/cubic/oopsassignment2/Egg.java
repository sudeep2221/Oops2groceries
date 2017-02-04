package com.cubic.oopsassignment2;
import java.util.Scanner;

public class Egg extends RetailItem {

	int numofegg;
	private double priceperdozen;

	public Egg(String name, int numofegg, double priceperdozen) {
		super(name);
		this.numofegg = numofegg;
		this.priceperdozen = priceperdozen;

	}

	public double getCost() {
		double d = numofegg * priceperdozen;
		return d * 0.083;
	}

	public void methodE() {
		System.out.println("enter the name of egg ");
		Scanner sc1 = new Scanner(System.in);

		super.name = sc1.nextLine();
		System.out.println("enter the number of eggs");
		numofegg = sc1.nextInt();
	}

}
