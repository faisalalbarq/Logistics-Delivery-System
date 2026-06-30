package mzn.faisal.logisticsDeliverySystem.Classes;

import java.util.ArrayList;

public class DeliveryOrder {

    private Vehicle vehicle;
    private ArrayList<Cargo> cargoList;
    private double totalDistance;
    private String destination;

    public DeliveryOrder(String destination, double totalDistance, Vehicle vehicle) {
        this.cargoList = new ArrayList<>();

        this.destination = destination;
        this.totalDistance = totalDistance;
        this.vehicle = vehicle;
    }

    public void addCargo(Cargo cargo){
        if(cargo == null || cargo.isShipped()) return;
        this.cargoList.add(cargo);
    }

    public double calculateOrderCost(){

        double totalWeight = 0;
        for(Cargo cargo : cargoList){
            totalWeight += cargo.getWeight();
        }
        return vehicle.calculateDeliveryCost(totalDistance, totalWeight);
    }



    public void printReceipt() {
        System.out.println("            DELIVERY ORDER RECEIPT              ");
        System.out.println("=".repeat(50));
        System.out.println("Destination: " + destination);
        System.out.println("Distance: " + totalDistance + " km");
        System.out.println("Assigned Vehicle: " + vehicle.getClass().getSimpleName());
        System.out.println("Vehicle ID: " + vehicle.getVehicleId());
        System.out.println("------------------------------------------------");
        System.out.println("Cargo Itemized List:");

        int itemNumber = 1;
        for (Cargo cargo : cargoList) {
            cargo.setShipped(true);
            System.out.println("  " + itemNumber + ". " + cargo.getDescription()
                    + " (" + cargo.getWeight() + " kg) -> Status: Shipped");
            itemNumber++;
        }

        System.out.println("------------------------------------------------");
        System.out.println("TOTAL AMOUNT DUE: " + calculateOrderCost() + " JOD");
        System.out.println("================================================\n");
    }
}
