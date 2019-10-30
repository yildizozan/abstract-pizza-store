package com.company;

public class PizzaStoreDrive {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();

		Pizza ethanPizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + ethanPizza.getName() + "\n");

		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		Pizza joelPizza = chicagoPizzaStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + joelPizza.getName() + "\n");

	}
}
