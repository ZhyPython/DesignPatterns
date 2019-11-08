package main.com.spark.singleton;

public class Singleton04 {
    /**
     * 加入同步处理的方法，解决线程不安全问题
     * 但是由于所有的线程都要排队获取这个对象，会造成效率低下的问腿
     */
    private static Singleton04 instance;

    private Singleton04() {}

    public static synchronized Singleton04 getInstance() {
        if (instance == null) {
            instance = new Singleton04();
        }
        return instance;
    }
}
