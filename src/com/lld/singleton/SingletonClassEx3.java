package com.lld.singleton;
// Enum style
public enum SingletonClassEx3 {
   SINGLE_INSTANCE;

    @Override
    public String toString() {
        return "com.lld.singleton.SingletonClassEx3@" + SINGLE_INSTANCE.hashCode();
    }
}
