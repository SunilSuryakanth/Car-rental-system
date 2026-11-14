package carRentalSystem;

public class Main {
    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();

        Car car1 = new Car("C001", "Toyota", "Crysta", 400.0);
        Car car2 = new Car("C002", "Hyundai", "i20", 300.0);
        Car car3 = new Car("C003", "Kia", "Seltos", 250.0);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        rentalSystem.menu();
    }
}
