package main.com.spark.factory.simplefactory.order;

import main.com.spark.factory.simplefactory.pizza.CheesePizza;
import main.com.spark.factory.simplefactory.pizza.GreekPizza;
import main.com.spark.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OrderPizza {
//    public OrderPizza() {
//        /**
//         * 普通方式，类之间的依赖关系强，耦合程度高，不符合修改封闭，扩展开放的原则
//         */
//        Pizza pizza = null;
//        String orderType; //订购类型
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")) {
//                pizza = new BJGreekPizza();
//                pizza.setName(" 希纳披萨");
//            } else if (orderType.equals("cheese")) {
//                pizza = new BJCheesePizza();
//                pizza.setName(" 奶酪披萨");
//            } else {
//                break;
//            }
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }

    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        String orderType = ""; // 用户输入的值
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            //输出披萨
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
        } while (true);
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
