package mzn.faisal.logisticsDeliverySystem.Classes;

public class Drone extends Vehicle{


    public Drone(String vehicleId, double baseTripCost, double fuelLevel) {
        super(vehicleId, baseTripCost, fuelLevel);
    }

    @Override
    public double calculateDeliveryCost(double distance, double weight) {
        return getBaseTripCost() + (distance * 2.0);
    }
}
