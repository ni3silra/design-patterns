package com.lld.factory;

public class Client {
    public static void main(String[] args) {

        Shipment paperShipment = Shipment.createEmptyShipment()
                .setLoad("Paper")
                .setShipmentType(ShipmentType.RoadLogistic)
                .build();

        Shipment plasticShipment = Shipment.createEmptyShipment()
                .setLoad("Plastic")
                .setShipmentType(ShipmentType.SeaLogistic)
                .build();

        Transport paperTransport = TransportFactory.createTransportFactory()
                                    .getTransport(paperShipment);
        Transport plasticTransport = TransportFactory.createTransportFactory()
                                    .getTransport(plasticShipment);

        System.out.println(paperTransport.planDelivery());
        System.out.println(plasticTransport.planDelivery());
    }
}
