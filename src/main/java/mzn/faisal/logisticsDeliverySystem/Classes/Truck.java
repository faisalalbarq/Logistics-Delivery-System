package mzn.faisal.logisticsDeliverySystem.Classes;

import mzn.faisal.logisticsDeliverySystem.Interfaces.ITrackable;

public class Truck extends Vehicle implements ITrackable {

    public Truck(String vehicleId, double baseTripCost, double fuelLevel) {
        super(vehicleId, baseTripCost, fuelLevel);
    }

    @Override
    public double calculateDeliveryCost(double distance, double weight) {
        return getBaseTripCost() + (distance * 1.2) + (weight * 0.5);
    }

    @Override
    public void updateLocation(double latitude, double longitude) {
        System.out.println("[Truck Tracking - ID: " + vehicleId + "]: Current coordinates: ("
                + latitude + ", " + longitude + ") [Next update in 10 mins].");
    }
}
