package com.designs.creational.factory;

public class RoadTransport extends Transport{

    public RoadTransport(Shipment shipment) {
        super(shipment);
    }

    @Override
    public String planDelivery() {
        return "Road Transport :- " + shipment.getLoad();
    }
}
