package com.lld.abstarctfactory;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CofeeTable createCFTable() {
        return new ModernCFTable();
    }
}
