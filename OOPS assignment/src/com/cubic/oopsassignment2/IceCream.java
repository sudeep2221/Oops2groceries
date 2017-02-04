package com.cubic.oopsassignment2;

public class IceCream extends RetailItem {

	private double costoficecream;

	public IceCream(String name, double costoficecream) {
		super(name);
		this.setCostoficecream(costoficecream);
	}

	public double getCost() {

		return getCostoficecream();
	}

	public double getCostoficecream() {
		return costoficecream;
	}

	public void setCostoficecream(double costoficecream) {
		this.costoficecream = costoficecream;
	}

}
