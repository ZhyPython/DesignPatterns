package main.com.spark.factory.abstractfactory.pizza;

public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("北京奶酪披萨，准备原材料");
    }
}
