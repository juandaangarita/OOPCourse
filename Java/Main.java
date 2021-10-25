package Java;

class Main{
    public static void main(String[] args) {

        Car car = new Car("AMQ123", new Account("Andres Florez", "AND123456")); //Here the object "car" it is created based on the class defined in the class Car
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE567", new Account("Andrea Herrera", "2345ttg213"));
        car2.passenger = 4;
        car2.printDataCar();

        User firstUser = new User("Daniel Torres", "CC 10587954321");
        firstUser.email = "papacito@email.com";
        firstUser.printDataUser();
        firstUser.printDataAccount();

    }
}