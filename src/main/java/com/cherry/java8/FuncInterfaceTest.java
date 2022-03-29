package com.cherry.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Author: 刘骐
 * @Date: 2022/3/29 14:37
 *
 *      * 四大内置函数式接口
 *      * 1 Consumer<T> : 消费型接口，void accept()
 *      * 2 Supplier<T> : 供给型接口,T get()
 *      * 3 Function<T,R> : 函数型接口,R apply(T),->接口中只有一个抽象方法的接口。 @FunctionalInterface 修饰
 *      * 4 Predicate<T> : 断言型接口
 *
 */
public class FuncInterfaceTest {

    @Test
    public void test3(){

    }

    public String strHandle(String s1, String s2, Function<String,String> fun){
        fun.apply(s1);
        return "";
    }

    @Test
    public void test2(){
        List<Integer> numList = getNumList(10, () -> (int) Math.random() * 100);

    }
    public List<Integer> getNumList(int num, Supplier<Integer> sup){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(sup.get());
        }
        return list;
    }

    @Test
    public void test1(){
        happy(10,(m)-> System.out.println("消费了："+m));
    }
    void happy(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }


}
