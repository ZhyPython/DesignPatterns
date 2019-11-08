package main.com.spark.factory.simplefactory.pizza;

public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("奶酪披萨，准备原材料");
    }
}
