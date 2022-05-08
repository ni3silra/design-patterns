package com.designs.creational.singleton;
// Enum style
public enum SingletonClassEx3 {
   SINGLE_INSTANCE;

    @Override
    public String toString() {
        return "com.designs.creational.singleton.SingletonClassEx3@" + SINGLE_INSTANCE.hashCode();
    }
}
