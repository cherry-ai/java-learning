package com.learn.pattern.simpleFactory.one;

/**
 *
 */
public class Client {
    public static void main(String args[]) {
        try {
            TV tv;
//            String brandName = XMLUtilTV.getBrandName();

            tv = TVFactory.produceTV("Haier");
            tv.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
