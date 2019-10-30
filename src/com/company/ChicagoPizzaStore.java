package com.company;

public class ChicagoPizzaStore extends PizzaStore {
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();

		switch (type) {
			case "cheese":
				pizza = new CheesePizza(factory);
				pizza.setName("Chicago Style Deep Dish Cheese Pizza");
				break;
		}


		return pizza;
	}
}
