package test.com.spark.singleton;

import main.com.spark.singleton.*;

public class TestSingleton {
    public static void main(String[] args) {
        //懒汉式测试
        Singleton01 instance1 = Singleton01.getInstance();
        Singleton01 instance2 = Singleton01.getInstance();
        System.out.println(instance1 == instance2);
        //懒汉式测试
        Singleton02 instance3 = Singleton02.getInstance();
        Singleton02 instance4 = Singleton02.getInstance();
        System.out.println(instance3 == instance4);

    }
}
