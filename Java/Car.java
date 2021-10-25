package Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    // Constructor
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println("License: " + license);
        System.out.println("Driver: " + driver.name);
        System.out.println("Quantity of passenger: " + passenger);
        System.out.println("----------------------------");
    }
    
}
