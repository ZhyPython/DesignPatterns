package main.com.spark.factory.abstractfactory.pizza;

public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("伦敦奶酪披萨，准备原材料");
    }
}