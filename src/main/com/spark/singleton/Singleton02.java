package main.com.spark.singleton;

public class Singleton02 {
    /**
     * 饿汉式单例模式，静态代码块创建
     * 对象在类加载时创建
     */
    private Singleton02() {}

    private static final Singleton02 INSTANCE;

    static {
        INSTANCE = new Singleton02();
    }

    public static Singleton02 getInstance() {
        return INSTANCE;
    }
}
