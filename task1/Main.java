package task1;
public class Main {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Markus Agnsgaard", 22);
        Car car1 = new Car("Audi", "RS3", 2018, "Sedan");
        Car car2 = new Car("BMW", "620i", 2019, "Sedan");

car1.setDriver(driver1);
car2.setDriver(driver1);
        System.out.println(car1+": "+driver1);
        System.out.println(car2+": "+driver1);
    }
}
