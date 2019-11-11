package main.com.spark.factory.abstractfactory.order;

import main.com.spark.factory.abstractfactory.pizza.Pizza;

// 抽象工厂的接口
public interface IAbsFactory {
    public Pizza createPizza(String orderType);
}
