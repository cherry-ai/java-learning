package com.cherry.gof23.create.singleton;

/**
 * @Author: liuq
 * @Date: 2021/12/9 11:22
 * 饱汉模式
 */
public class Singleton2 {

    private Singleton2() {

    }

    // 和饿汉模式相比，这边不需要先实例化出来，注意这里的 volatile，它是必须的
    private static volatile Singleton2 instance = null;

    /**
     * 如果直接在 getInstance() 方法签名上加上 synchronized，性能太差
     * @return
     */
    public static Singleton2 getInstance() {
        if (instance == null) {
            // 加锁
            synchronized (Singleton2.class) {
                // 这一次判断也是必须的，不然会有并发问题
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
