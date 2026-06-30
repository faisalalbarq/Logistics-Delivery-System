package mzn.faisal.logisticsDeliverySystem.Classes;

public class Cargo {
    private double weight;
    private String description;
    private boolean isShipped;

    public Cargo(double weight, String description) {
        this.weight = weight;
        this.description = description;
        this.isShipped = false;
    }

    public double getWeight() { return weight; }
    public String getDescription() { return description; }
    public boolean isShipped() { return isShipped; }

    public void setShipped(boolean shipped) {
        this.isShipped = shipped;
    }
}