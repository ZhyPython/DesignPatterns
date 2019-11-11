package main.com.spark.factory.abstractfactory.order;

import main.com.spark.factory.abstractfactory.pizza.LDCheesePizza;
import main.com.spark.factory.abstractfactory.pizza.LDGreekPizza;
import main.com.spark.factory.abstractfactory.pizza.Pizza;

public class LDFactory implements IAbsFactory {
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
