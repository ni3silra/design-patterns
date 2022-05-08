package com.designs.creational.factory;

public class SeaTransport extends Transport{

    public SeaTransport(Shipment shipment) {
        super(shipment);
    }

    @Override
    public String planDelivery() {
        return "Sea Transport - " + shipment.getLoad();
    }

}
