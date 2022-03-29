package com.cherry.java8;

/**
 * @Author: 刘骐
 * @Date: 2022/3/29 14:20
 */
public interface MyFunction<T,R> {
    R getVal(T t1,T t2);
}
