package Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    // Constructor
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;      
    }

    void printDataCar(){
        if(passenger != null){
            System.out.println("License: " + license);
            System.out.println("Driver: " + driver.name);
            System.out.println("Quantity of passenger: " + passenger);
            System.out.println("----------------------------");
        }
    }

    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger== 4){
            this.passenger = passenger;
        }
        else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
        
    }
    
}
