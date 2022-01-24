package com.lld.singleton;
// with multithreading
public class SingletonClassEx2 {
    static SingletonClassEx2 singletonClassEx1;

    private SingletonClassEx2() {}

    public static synchronized SingletonClassEx2 getInstance(){
        return (singletonClassEx1 != null) ? singletonClassEx1:( singletonClassEx1 = new SingletonClassEx2());
    }


//    @Override
//    public String toString() {
//        return "SingletonClassEx1" + singletonClassEx1.hashCode();
//    }
}
