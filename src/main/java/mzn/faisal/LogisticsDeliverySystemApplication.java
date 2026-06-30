package mzn.faisal;

import mzn.faisal.logisticsDeliverySystem.Classes.*;

import java.util.ArrayList;

public class LogisticsDeliverySystemApplication {
    static void main() {

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Drone("1", 100, 100));
        vehicles.add(new Drone("2", 90, 90));
        vehicles.add(new Truck("3", 80, 80));
        vehicles.add(new Truck("4", 70, 70));

        DeliveryOrder order1 = new DeliveryOrder("Destination A", 50, vehicles.getFirst());
        order1.addCargo(new Cargo(10, "Electronics"));
        order1.addCargo(new Cargo(20, "Clothing"));

        order1.printReceipt();

        System.out.println("-".repeat(50));
    }
}
