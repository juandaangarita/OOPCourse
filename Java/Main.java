package Java;

class Main{
    public static void main(String[] args) {

        UberX uberX = new UberX("AMQ123", new Account("Andres Florez", "AND123456"), "Renault", "Sandero"); //Here the object "car" it is created based on the class defined in the class Car
        uberX.setPassenger(4);
        uberX.printDataCar();
        
        UberVan uberVan = new UberVan("10932574se", new Account("Sergio Gomez", "AND123456")); 
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        Car car2 = new Car("QWE567", new Account("Andrea Herrera", "2345ttg213"));
        car2.passenger = 4;
        car2.printDataCar();

        User firstUser = new User("Daniel Torres", "CC 10587954321");
        firstUser.email = "papacito@email.com";
        firstUser.printDataUser();
        firstUser.printDataAccount();

    }
}