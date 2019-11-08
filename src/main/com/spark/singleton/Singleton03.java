package main.com.spark.singleton;

public class Singleton03 {
    /**
     * 懒汉式单例模式，提供一个公有的静态方法，在方法内创建对象，
     * 与饿汉式不同的是，饿汉式在类加载时创建对象，懒汉式在方法被调用时创建对象
     *
     * 线程不安全，在多线程中，如果一个线程进入了if()语句内，但是还没创建对象，这时另外一个线程也进入
     * 了if()语句内，那么就会创建两个实例对象。
     */
    private static Singleton03 instance;

    private Singleton03() {}

    public static Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}
