package com.designs.creational.singleton;
// without multithreading
public class SingletonClassEx1 {
    static SingletonClassEx1 singletonClassEx1;

    private SingletonClassEx1() {}

    public static  SingletonClassEx1 getInstance(){
        return (singletonClassEx1 != null) ? singletonClassEx1:( singletonClassEx1 = new SingletonClassEx1());
    }


//    @Override
//    public String toString() {
//        return "SingletonClassEx1" + singletonClassEx1.hashCode();
//    }
}
