package com.cherry.pattern.factoryMethod;

public class HaierTVFactory implements TVFactory {

    @Override
    public TV produceTV() {
        System.out.println("HaierTVFactory");
        return new HaierTV();
    }
}