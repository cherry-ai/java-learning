package com.cherry.java8;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @Author: 刘骐
 * @Date: 2019/12/11 14:58
 *
 */
public class LambdaTest {

    /**
     * lambda表达式：
     * 左侧：lambda表达式参数列表
     * 右侧：lambda表达式所执行的功能，即lambda体
     *
     * lambda表达式需要”函数式“接口的支持
     * 函数式接口：接口中只有一个抽象方法，可以使用@FunctionInterface修饰
     *
     * 语法1： 无参数 无返回值 ()->System.out.println("hello");
     *
     */
    @Test
    public void testLambda(){
        //1 无参数 无返回值 ()->System.out.println("hello");
        int x= 1;
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部内。"+x);
            }
        };
        run1.run();

        Runnable r2 = ()->System.out.println("无参数 无返回值"+x);
        r2.run();
    }

    /**
     * 语法2：有一个参数 无返回值
     * 语法3：有一个参数 小括号可以不写
     */
    @Test
    public void test2(){
        Consumer<String> consumer = (y)->System.out.println(y);
        consumer.accept("有一个参数 无返回值");

        consumer = y->System.out.println(y);
        consumer.accept("有一个参数 小括号可以不写");
    }

    /**
     * 语法4：有2+ 参数，lambda体有多条语句,使用大括号
     * 语法5：有2+ 参数 lambda体只有一条语句，大括号可以省略
     * 语法6：lambda参数列表数据类型可以不写，jvm编译器可以通过上下文推断出数据类型，即”类型推断“
     *  (Integer x,Integer y) (x,y)
     */
    @Test
    public void test3(){
        //4 有2+ 参数，lambda体有多条语句,使用大括号
        Comparator<Integer> comparator = (i, j)->{
            return i+j;
        };
        System.out.println(comparator.compare(1,6)+"");

        //5 有2+ 参数 lambda体只有一条语句，大括号可以省略
        Comparator<Integer> comparator2 = (x1,y1)->Integer.compare(x1,y1);
        System.out.println(comparator2.compare(9,5)+"");
    }

    @Test
    public void testLx(){
        countFun(100L,200L,(x,y)-> x + y);
        countFun(100L,200L,(x,y)-> x * y);
    }

    public void countFun(Long l1,Long l2,MyFunction<Long,Long> mf){
        System.out.printf(mf.getVal(l1,l2)+"\n");
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
