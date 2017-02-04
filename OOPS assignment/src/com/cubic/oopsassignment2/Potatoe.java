package com.cubic.oopsassignment2;
import java.util.Scanner;

public class Potatoe extends RetailItem {
	double weightinpound;
	private double priceperpound;

	public Potatoe(String name, double weightinpound, double priceperpound) {
		super(name);
		this.weightinpound = weightinpound;
		this.priceperpound = priceperpound;
	}

	public double getCost() {
		return (weightinpound) * (priceperpound);

	}

	public void methodP() {
		System.out.println("enter the name of potato ");
		Scanner sc1 = new Scanner(System.in);

		super.name = sc1.nextLine();
		System.out.println("enter the weight");
		weightinpound = sc1.nextDouble();
	}

}
