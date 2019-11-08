package main.com.spark.factory.simplefactory.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("希纳披萨，准备原材料");
    }
}
