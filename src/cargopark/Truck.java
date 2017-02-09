package cargopark;

/**
 * Created by jivan on 4.2.17.
 */
public class Truck {

    private double weightCapacity;

    private double volumeCapacity;

    private double fuelConsumption;

    public Truck(double weightCapacity, double volumeCapacity, double fuelConsumption) {
        this.weightCapacity = weightCapacity;
        this.volumeCapacity = volumeCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public double getWeightCapacity() {
        return weightCapacity;
    }

    public double getVolumeCapacity() {
        return volumeCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
