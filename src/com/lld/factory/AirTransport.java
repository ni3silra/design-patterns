package com.lld.factory;

public class AirTransport extends Transport{

    public AirTransport(Shipment shipment) {
        super(shipment);
    }

    @Override
    String planDelivery() {
        return "Road Transport :- " + shipment.getLoad();
    }
}
