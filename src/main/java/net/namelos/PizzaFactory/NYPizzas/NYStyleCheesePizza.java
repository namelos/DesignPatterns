package net.namelos.PizzaFactory.NYPizzas;

import net.namelos.PizzaFactory.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marina Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
