package Java;

public class Driver extends Account{

    public Driver(String name, String document){
        super(name, document);
    }

    void printDataUser(){
        System.out.println("Name: " + name);
        System.out.println("Document: " + document);
        System.out.println("Email: " + email);
        System.out.println("----------------------------");
    }
    
}
