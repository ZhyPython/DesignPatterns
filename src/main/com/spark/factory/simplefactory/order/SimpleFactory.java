package main.com.spark.factory.simplefactory.order;

import main.com.spark.factory.simplefactory.pizza.CheesePizza;
import main.com.spark.factory.simplefactory.pizza.GreekPizza;
import main.com.spark.factory.simplefactory.pizza.Pizza;


public class SimpleFactory {
    //根据orderType返回对应的Pizza对象
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希纳披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨");
        }
        return pizza;
    }
}
