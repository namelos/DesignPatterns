package net.namelos.PizzaFactory;

import net.namelos.PizzaFactory.NYPizzas.NYStyleCheesePizza;
import net.namelos.PizzaFactory.NYPizzas.NYStyleClamPizza;
import net.namelos.PizzaFactory.NYPizzas.NYStylePepperoniPizza;
import net.namelos.PizzaFactory.NYPizzas.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese"))
            return new NYStyleCheesePizza();
        else if (item.equals("veggie"))
            return new NYStyleVeggiePizza();
        else if (item.equals("clam"))
            return new NYStyleClamPizza();
        else if (item.equals("pepperoni"))
            return new NYStylePepperoniPizza();
        else
            return null;
    }
}
