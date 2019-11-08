package main.com.spark.factory.factorymethod.order;

import main.com.spark.factory.factorymethod.pizza.BJCheesePizza;
import main.com.spark.factory.factorymethod.pizza.BJGreekPizza;
import main.com.spark.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    public abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        String orderType; //订购类型
        do {
            orderType = getType();
            pizza = createPizza(orderType); // 抽象的方法，由工厂子类实现，根据多态的性质，会调用子类的方法
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    //获取订购的披萨类型
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
