public class Drone {
    private String id;
    private String status;
    private double cargoCapacity;
    private double currentCargoWeight;

    public Drone(String id, double cargoCapacity) {
        this.id = id;
        this.status = "IDLE";
        this.cargoCapacity = cargoCapacity;
        this.currentCargoWeight = 0;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean canCarryCargo(double weight) {
        return weight <= cargoCapacity;
    }

    public void assignCargo(Cargo cargo) {
        if (canCarryCargo(cargo.getWeight())) {
            this.currentCargoWeight = cargo.getWeight();
            this.status = "IN_FLIGHT";
        } else {
            System.out.println("Груз слишком тяжелый для дрона!!!!");
        }
    }

    public void completeDelivery() {
        this.status = "IDLE";
        this.currentCargoWeight = 0;
    }
}
