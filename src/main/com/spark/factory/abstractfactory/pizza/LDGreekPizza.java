package main.com.spark.factory.abstractfactory.pizza;

public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("伦敦希纳披萨，准备原材料");
    }
}
