package main.com.spark.singleton;

public class Singleton05 {
    /**
     * 这种方法，是无意义的，并不能解决线程不安全的问题
     * 当两个线程进入到if()语句中，一个线程先进入同步的代码块中，创建一个对象，
     * 然后另外一个线程拿到锁，进入对象中再次创建对象
     * 结果会生成两个对象
     */
    private static Singleton05 instance;

    private Singleton05() {}

    public static Singleton05 getInstance() {
        if (instance == null) {
            synchronized (Singleton05.class) {
                instance = new Singleton05();
            }
        }
        return instance;
    }
}
