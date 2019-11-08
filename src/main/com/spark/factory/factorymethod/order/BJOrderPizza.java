package main.com.spark.factory.factorymethod.order;

import main.com.spark.factory.factorymethod.pizza.BJCheesePizza;
import main.com.spark.factory.factorymethod.pizza.BJGreekPizza;
import main.com.spark.factory.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("cheese");
        } else if (orderType.equals("greek")) {
            pizza = new BJGreekPizza();
            pizza.setName("greek");
        }
        return pizza;
    }
}
