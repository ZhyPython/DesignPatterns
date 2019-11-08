package main.com.spark.singleton;


/**
 * 枚举类实现单例模式，因为枚举类自身就是单例模式
 */
public class Singleton08 {
    private Singleton08() {}

    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2= Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        instance1.sayOK();
    }
}

enum Singleton {
    INSTANCE;

    public void sayOK() {
        System.out.println("ok");
    }
}