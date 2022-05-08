package com.designs.creational.factory;

public class TransportFactory {

    public static TransportFactory createTransportFactory(){
        return new TransportFactory();
    }

    public Transport getTransport(Shipment shipment){
        return switch (shipment.getShipmentType()){
            case SeaLogistic ->  new SeaTransport(shipment);
            case RoadLogistic -> new RoadTransport(shipment);
            case AirLogistic -> new AirTransport(shipment);
        };
    }
}
