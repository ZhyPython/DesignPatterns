package main.com.spark.factory.simplefactory.order;

//发出订购
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
    }
}
