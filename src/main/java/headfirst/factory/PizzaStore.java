package headfirst.factory;

import headfirst.factory.pizza.Pizza;

/**
 * Created by Du on 16/8/13.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        // createPizz() 方法从工厂对象中移回PizzaStore
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // 实例化披萨的责任被移到一个"方法"中,此方法就如同是一个"工厂"
    abstract Pizza createPizza(String type);
}
