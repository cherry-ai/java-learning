package com.learn.thread.chapter1;

public class Tryconcurrency {

    public static void main(String[] args) {

        Thread t1 = new Thread(){

          @Override
          public void run(){

              browseNews();
          }

        };

        t1.start();

        enjoyMusic();

    }

    public static void browseNews(){
        for(int i=0;i<1000;i++){
            System.out.println("this is "+i+" i am browsing news! ");
            try {
                Thread.sleep(1L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void enjoyMusic(){
        for(int j=0;j<1000;j++){
            System.out.println("this is "+j+" i am enjoying music! ");
            try {
                Thread.sleep(1L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
