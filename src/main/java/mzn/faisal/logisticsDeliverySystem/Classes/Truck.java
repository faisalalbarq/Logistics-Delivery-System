package mzn.faisal.logisticsDeliverySystem.Classes;

public class Truck extends Vehicle{

    public Truck(String vehicleId, double baseTripCost, double fuelLevel) {
        super(vehicleId, baseTripCost, fuelLevel);
    }

    @Override
    public double calculateDeliveryCost(double distance, double weight) {
        return getBaseTripCost() + (distance * 1.2) + (weight * 0.5);
    }
}
