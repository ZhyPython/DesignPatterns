package main.com.spark.factory.abstractfactory.order;

import main.com.spark.factory.abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    private IAbsFactory factory;

    public OrderPizza(IAbsFactory factory) {
        setFactory(factory);
    }

    public void setFactory(IAbsFactory factory) {
        Pizza pizza = null;
        String orderType = "";
        this.factory = factory;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    public String getType() {
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
