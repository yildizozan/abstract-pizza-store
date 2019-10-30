package com.company;

public class NYPizzaStore extends PizzaStore {
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory factory = new NYPizzaIngredientFactory();

		switch (type) {
			case "cheese":
				pizza = new CheesePizza(factory);
				pizza.setName("New York Style Cheese Pizza");
				break;
			case "veggie":
				pizza = new VeggiePizza(factory);
				pizza.setName("New York Style Veggie Pizza");
				break;
			case "clam":
				pizza = new ClamPizza(factory);
				pizza.setName("New York Style Clam Pizza");
				break;
			case "pepperoni":
				pizza = new PepperoniPizza(factory);
				pizza.setName("New York Style Pepperoni Pizza");
				break;
		}

		return pizza;
	}
}
