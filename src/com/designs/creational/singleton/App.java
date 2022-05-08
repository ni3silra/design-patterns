package com.designs.creational.singleton;

public class App {

    public static void main(String[] args) {

        // without multithreading
        SingletonClassEx1 singletonClassEx1 = SingletonClassEx1.getInstance();
        SingletonClassEx1 singletonClassEx2 = SingletonClassEx1.getInstance();
        SingletonClassEx1 singletonClassEx3 = SingletonClassEx1.getInstance();

        System.out.println(singletonClassEx1);
        System.out.println(singletonClassEx2);
        System.out.println(singletonClassEx3);
        System.out.println("--------------------------------");

        // with multithreading
        SingletonClassEx2 singletonClassEx21 = SingletonClassEx2.getInstance();
        SingletonClassEx2 singletonClassEx22 = SingletonClassEx2.getInstance();
        SingletonClassEx2 singletonClassEx23 = SingletonClassEx2.getInstance();

        System.out.println(singletonClassEx21);
        System.out.println(singletonClassEx22);
        System.out.println(singletonClassEx23);
        System.out.println("--------------------------------");

        // enum style
        SingletonClassEx3 singletonClassEx31 = SingletonClassEx3.SINGLE_INSTANCE;
        SingletonClassEx3 singletonClassEx32 = SingletonClassEx3.SINGLE_INSTANCE;
        SingletonClassEx3 singletonClassEx33 = SingletonClassEx3.SINGLE_INSTANCE;

        System.out.println(singletonClassEx31);
        System.out.println(singletonClassEx32);
        System.out.println(singletonClassEx33);
        System.out.println("--------------------------------");

    }

}
