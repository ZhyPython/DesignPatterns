package main.com.spark.factory.abstractfactory.order;

import main.com.spark.factory.abstractfactory.pizza.*;

public class BJFactory implements IAbsFactory{
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
