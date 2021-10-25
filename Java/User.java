package Java;

public class User extends Account{

    public User(String name, String document){
        super(name, document);
    }

    void printDataUser(){
        System.out.println("Name: " + name);
        System.out.println("Document: " + document);
        System.out.println("Email: " + email);
        System.out.println("----------------------------");
    }
}
