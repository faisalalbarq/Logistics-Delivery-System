package mzn.faisal.logisticsDeliverySystem.Classes;

import mzn.faisal.logisticsDeliverySystem.Interfaces.IAutopilotable;
import mzn.faisal.logisticsDeliverySystem.Interfaces.ITrackable;

public class Drone extends Vehicle implements ITrackable, IAutopilotable {


    public Drone(String vehicleId, double baseTripCost, double fuelLevel) {
        super(vehicleId, baseTripCost, fuelLevel);
    }

    @Override
    public void updateLocation(double latitude, double longitude) {
        System.out.println("[Drone Tracking - ID: " + vehicleId + "]: Flight coordinates updated to: ("
                + latitude + ", " + longitude + ").");
    }

    @Override
    public void navigateTo(String destination) {
        System.out.println("[Drone Autopilot - ID: " + vehicleId + "]: Autopilot engaged. Launching autonomously towards: " + destination);
    }

    @Override
    public double calculateDeliveryCost(double distance, double weight) {
        return getBaseTripCost() + (distance * 2.0);
    }
}
