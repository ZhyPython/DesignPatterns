package main.com.spark.singleton;

public class Singleton06 {
    /**
     * 双重检查,就算两个线程都进入了if()代码块中，在同步代码块内也会再检查一次，不会有生成两个对象的情况
     * 保证效率，推荐使用
     * volatile简单的声明某个变量，同步线程内存和主内存之间的某一个值，这里就是instance的值
     * synchronized同步所有变量的值，资源消耗更多
     */
    private static volatile Singleton06 instance;

    private Singleton06() {}

    public static Singleton06 getInstance() {
        if (instance == null) {
            synchronized (Singleton06.class) {
                if (instance == null) {
                    instance = new Singleton06();
                }
            }
        }
        return instance;
    }
}
