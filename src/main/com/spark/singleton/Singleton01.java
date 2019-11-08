package main.com.spark.singleton;

public class Singleton01 {
    /**
     * 饿汉式单例模式，静态常量创建
     * 对象在类加载时创建，所以如果在整个程序中没有使用过这个实例，就会造成内存的浪费
     * 1 构造器私有化，使得类实例无法在类的外部创建，即不能在类外使用new
     * 2 在类中创建对象，对象是静态常量，所有类共用这个常量
     * 3 提供一个静态的公共方法，这个方法能够直接获取第 2 步创建的静态常量
     */
    private Singleton01() {}

    private final static Singleton01 INSTANCE = new Singleton01();

    public static Singleton01 getInstance() {
        return INSTANCE;
    }
}
