package com.lld.abstarctfactory;

public class Client {

    public static void main(String[] args) {

        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();

        Sofa sofa = furnitureFactory.createSofa();
        Chair chair = furnitureFactory.createChair();

        System.out.println(sofa.designSofa());
        System.out.println(chair.designChair());
        System.out.println(furnitureFactory.createCFTable().designCofeeTable());

        FurnitureFactory oldFurnitureFactory = new OldFurnitureFactory();

        Sofa oldSofa = oldFurnitureFactory.createSofa();
        Chair oldChair = oldFurnitureFactory.createChair();

        System.out.println(oldSofa.designSofa());
        System.out.println(oldChair.designChair());
        System.out.println(oldFurnitureFactory.createCFTable().designCofeeTable());
    }
}
