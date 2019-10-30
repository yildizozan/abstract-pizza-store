package com.company;

public interface PizzaIngredientFactory {
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggie[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
}
