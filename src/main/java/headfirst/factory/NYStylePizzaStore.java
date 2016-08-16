package headfirst.factory;

import headfirst.factory.pizza.NYStyleCheesePizza;
import headfirst.factory.pizza.Pizza;

/**
 * Created by Du on 16/8/13.
 */
public class NYStylePizzaStore extends PizzaStore {


    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        }

        return pizza;
    }
}
