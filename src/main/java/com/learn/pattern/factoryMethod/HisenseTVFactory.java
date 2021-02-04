package com.learn.pattern.factoryMethod;

public class HisenseTVFactory implements TVFactory {

    @Override
    public TV produceTV() {
        System.out.println("HisenseTVFactory");
        return new HisenseTV();
    }
}