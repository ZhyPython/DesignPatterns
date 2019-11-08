package main.com.spark.factory.factorymethod.pizza;

public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("北京希纳披萨，准备原材料");
    }
}
