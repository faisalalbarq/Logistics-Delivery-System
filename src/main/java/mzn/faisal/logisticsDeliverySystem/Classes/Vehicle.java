package mzn.faisal.logisticsDeliverySystem.Classes;

public abstract class Vehicle {

    protected String vehicleId;
    private double baseTripCost;
    protected double fuelLevel;

    public Vehicle(String vehicleId, double baseTripCost, double fuelLevel) {
        this.vehicleId = vehicleId;
        this.baseTripCost = baseTripCost;
        this.fuelLevel = fuelLevel;
    }

    public abstract double calculateDeliveryCost(double distance, double weight);

    protected double getBaseTripCost() {
        return baseTripCost;
    }
}
