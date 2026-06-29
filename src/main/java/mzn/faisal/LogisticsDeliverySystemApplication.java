package mzn.faisal;

import mzn.faisal.logisticsDeliverySystem.Classes.Drone;
import mzn.faisal.logisticsDeliverySystem.Classes.Truck;
import mzn.faisal.logisticsDeliverySystem.Classes.Vehicle;

import java.util.ArrayList;

public class LogisticsDeliverySystemApplication {
    static void main() {

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Drone("1", 100, 100));
        vehicles.add(new Drone("2", 90, 90));
        vehicles.add(new Truck("3", 80, 80));
        vehicles.add(new Truck("4", 70, 70));

        System.out.println("-".repeat(50));
    }
}
