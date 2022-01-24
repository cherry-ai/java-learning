package com.cherry.gof23.create.singleton;

import java.util.Date;

/**
 * @Author: liuq
 * @Date: 2021/12/9 11:20
 *
 * 饿汉模式
 */
public class Singleton1 {

    // 首先，将 new Singleton() 堵死
    private Singleton1() {

    };
    // 创建私有静态实例，意味着这个类第一次使用的时候就会进行创建
    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }
    // 瞎写一个静态方法。这里想说的是，如果我们只是要调用 Singleton.getDate(...)，
    // 本来是不想要生成 Singleton 实例的，不过没办法，已经生成了
    public static Date getDate(String mode) {
        return new Date();
    }
}
