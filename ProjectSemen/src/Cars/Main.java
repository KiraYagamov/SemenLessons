package Cars;

public class Main {
    public static void main(String[] args) {
        Driver alex = new Driver("Alex", 10);
        Driver ivan = new Driver("Ivan", 5);
        Car car = new BMW(alex);

        car.drive();
        car.setDriver(ivan);
        car.drive();
    }
}