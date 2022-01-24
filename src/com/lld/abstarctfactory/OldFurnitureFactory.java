package com.lld.abstarctfactory;

public class OldFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new OldChair();
    }

    @Override
    public Sofa createSofa() {
        return new OldSofa();
    }

    @Override
    public CofeeTable createCFTable() {
        return new OldCFTable();
    }
}
