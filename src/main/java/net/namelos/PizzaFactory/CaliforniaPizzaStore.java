package net.namelos.PizzaFactory;

import net.namelos.PizzaFactory.CaliforniaPizzas.CaliforniaStyleCheesePizza;
import net.namelos.PizzaFactory.CaliforniaPizzas.CaliforniaStyleClamPizza;
import net.namelos.PizzaFactory.CaliforniaPizzas.CaliforniaStylePepperoniPizza;
import net.namelos.PizzaFactory.CaliforniaPizzas.CaliforniaStyleVeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese"))
            return new CaliforniaStyleCheesePizza();
        else if (item.equals("veggie"))
            return new CaliforniaStyleVeggiePizza();
        else if (item.equals("clam"))
            return new CaliforniaStyleClamPizza();
        else if (item.equals("pepperoni"))
            return new CaliforniaStylePepperoniPizza();
        else
            return null;
    }
}
