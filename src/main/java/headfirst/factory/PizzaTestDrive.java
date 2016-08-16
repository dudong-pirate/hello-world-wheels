package headfirst.factory;

import headfirst.factory.NYStylePizzaStore;
import headfirst.factory.PizzaStore;
import headfirst.factory.pizza.Pizza;

/**
 * Created by Du on 16/8/14.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYStylePizzaStore();


        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    }

}
