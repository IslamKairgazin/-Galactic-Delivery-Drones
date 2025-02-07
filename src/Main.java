public class Main {
    public static void main(String[] args) {

        Planet mars = new Planet("Mars", "Углекислый газ");
        Planet jupiter = new Planet("Jupiter", "Водород");

        Cargo balls = new Cargo(10, "Balls");

        Drone drone = new Drone("Drone1", 15);

        System.out.println("Статус дрона: " + drone.getStatus());

        if (drone.canCarryCargo(balls.getWeight())) {
            drone.assignCargo(balls);

            System.out.println("Статус дрона после старта груза: " + drone.getStatus());

            drone.completeDelivery();
            System.out.println("Статус дрона после завершения доставки: " + drone.getStatus());
        } else {
            System.out.println("Дрон не может взять этот груз!");
        }
    }
}
