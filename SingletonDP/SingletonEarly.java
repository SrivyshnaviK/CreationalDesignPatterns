package com.Vyshnavi.SingletonDP;

public class SingletonEarly {
    private static volatile SingletonEarly obj=new SingletonEarly();
    private SingletonEarly(){}
    public static SingletonEarly getInstance(){
        return obj;
    }
    public static void main(String[] args) {
        System.out.println(getInstance());
    }
}
