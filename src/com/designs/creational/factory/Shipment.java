package com.designs.creational.factory;

public class Shipment {
    ShipmentType logisticType;
    String load;

    public static Shipment createEmptyShipment(){
        return new Shipment();
    }

    public Shipment setLoad(String load) {
        this.load = load;
        return this;
    }

    public Shipment setShipmentType(ShipmentType logisticType) {
        this.logisticType = logisticType;
        return this;
    }

    public String getLoad() {
        return load;
    }

    public Shipment build(){
        return this;
    }

    public ShipmentType getShipmentType() {
        return logisticType;
    }


    @Override
    public String toString() {
        return "Shipment{" +
                "logisticType=" + logisticType +
                ", load='" + load + '\'' +
                '}';
    }
}
