package com.cubic.oopsassignment2;
import java.util.Scanner;

public class Sundae extends IceCream {

	private double costofthetopping;

	public Sundae(String name, double costoficecream, double costofthetopping) {
		super(name, costoficecream);
		this.costofthetopping = costofthetopping;
	}
	public String toString(){
		return getName();
	}

	public double getCost() {

		return (costofthetopping + getCostoficecream());
	}

	public void methodS() {
		System.out.println("enter the name of Sundae ");
		Scanner sc1 = new Scanner(System.in);

		super.name = sc1.nextLine();
		System.out.println("enter the cost of icecream");
		setCostoficecream(sc1.nextDouble());
		System.out.println("enter the cost of topping");
		costofthetopping = sc1.nextDouble();
	}
}
