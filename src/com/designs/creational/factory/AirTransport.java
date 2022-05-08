package com.designs.creational.factory;

public class AirTransport extends Transport{

    public AirTransport(Shipment shipment) {
        super(shipment);
    }

    @Override
    String planDelivery() {
        return "Air Transport :- " + shipment.getLoad();
    }
}
