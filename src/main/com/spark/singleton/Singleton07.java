package main.com.spark.singleton;

public class Singleton07 {
    /**
     * 静态内部类实现懒汉式
     * 外部类可以直接访问内部类的private变量，以及protected变量
     */
    private Singleton07() {}

    private static class innerSingleton {
        private static final Singleton07 INSTANCE = new Singleton07();
    }

    public static Singleton07 getInstance() {
        return innerSingleton.INSTANCE;
    }
}
