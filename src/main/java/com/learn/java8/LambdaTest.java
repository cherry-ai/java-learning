package com.learn.java8;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @Author: liuq
 * @Date: 2019/12/11 14:58
 *
 *
 *
 */
public class LambdaTest {

    /**
     * lambda表达式：
     * 左侧：lambda表达式参数列表
     * 右侧：lambda表达式所执行的功能，及lambda体
     *
     * lambda表达式需要”函数式“接口的支持
     * 函数式接口：接口中只有一个抽象方法，可以使用@FunctionInterface修饰
     *
     */
    @Test
    public void testLambda(){

        //1 无参数 无返回值
        int x= 1;
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部内。"+x);
            }
        };
        run1.run();

        Runnable r2 = ()->System.out.println("匿名内部内"+x);
        r2.run();

        //2 有一个参数 无返回值
        Consumer<String> consumer = (y)->System.out.println(y);
        consumer.accept("you璀璨");
        consumer.accept("you璀璨2");

        //3 有一个参数 小括号可以不写
        consumer = y->System.out.println(y);

        //4 有2+ 参数，lambda体有多条语句,使用大括号
        Comparator<Integer> comparator = (i, j)->{

            return i+j;
        };
        System.out.println(comparator.compare(1,6)+"");
        //5 有2+ 参数 lambda体只有一条语句，大括号可以省略
        Comparator<Integer> comparator2 = (x1,y1)->Integer.compare(x1,y1);
        System.out.println(comparator2.compare(9,5)+"");

        //6 参数列表数据类型可以不写，jvm编译器可以通过上下文推断出数据类型，即”类型推断“

    }

    /**
     * 四大内置对象：
     * 1 Consumer<T> : 消费型接口
     *
     * 2 Supplier<T> : 供给型接口
     * 3 Function<T,R> : 函数型接口
     * 4 Predicate<T> : 断言型接口
     */
    @Test
    public void testLambda2(){
        happy(10,(m)-> System.out.println("消费了："+m));
    }

    void happy(double money,Consumer<Double> consumer){
        consumer.accept(money);

    }

    /**
     * 方法引用：
     * 如果Lambda体中的内容有方法已经实现了，可以使用方法引用
     * Lambda表达式的另外一种表现形式
     *
     */
    @Test
    public void testLambdaMethodRef(){

        PrintStream ps = System.out;
        Consumer<String> consumer = (x)-> ps.println(x);

        PrintStream ps1 = System.out;
        Consumer<String> consumer1 = ps1::println;
        consumer1.accept("方法引用");

        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("方法引用2");

    }



}
