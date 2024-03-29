package com.cherry.gof23.create.singleton;

/**
 * @Author: liuq
 * @Date: 2021/12/9 11:25
 * 嵌套类
 */
public class Singleton3 {
    private Singleton3() {

    }

    // 主要是使用了 嵌套类可以访问外部类的静态属性和静态方法 的特性
    private static class Holder {
        private static Singleton3 instance = new Singleton3();
    }
    public static Singleton3 getInstance() {
        return Holder.instance;
    }
}
