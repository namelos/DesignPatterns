package net.namelos.PizzaFactory;

import net.namelos.PizzaFactory.ChicagoPizzas.ChicagoStyleCheesePizza;
import net.namelos.PizzaFactory.ChicagoPizzas.ChicagoStyleClamPizza;
import net.namelos.PizzaFactory.ChicagoPizzas.ChicagoStylePepperoniPizza;
import net.namelos.PizzaFactory.ChicagoPizzas.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese"))
            return new ChicagoStyleCheesePizza();
        else if (item.equals("veggie"))
            return new ChicagoStyleVeggiePizza();
        else if (item.equals("clam"))
            return new ChicagoStyleClamPizza();
        else if (item.equals("pepperoni"))
            return new ChicagoStylePepperoniPizza();
        else
            return null;
    }
}
