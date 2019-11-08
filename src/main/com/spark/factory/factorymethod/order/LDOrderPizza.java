package main.com.spark.factory.factorymethod.order;

import main.com.spark.factory.factorymethod.pizza.LDCheesePizza;
import main.com.spark.factory.factorymethod.pizza.LDGreekPizza;
import main.com.spark.factory.factorymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName("cheese");
        } else if (orderType.equals("greek")) {
            pizza = new LDGreekPizza();
            pizza.setName("greek");
        }
        return pizza;
    }
}
