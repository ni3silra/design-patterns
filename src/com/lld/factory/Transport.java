package com.lld.factory;

public abstract class Transport {
    Shipment shipment;

    public Transport(Shipment shipment){
        this.shipment = shipment;
    }

    abstract String planDelivery();
}
