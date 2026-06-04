package AdressBookSystem;
import java.util.ArrayList;
import java.util.Scanner;

public class Book3 {

    public static class AddressBookSystem{
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    public AddressBookSystem(String firstName, String lastName, String address,String city, String state, String zip,String phoneNumber, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

   }


    
     public static void main(String args[]){

        ArrayList<AddressBookSystem> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First name: ");
        String firstName=sc.nextLine();

        System.out.println("Enter last name: ");
        String lastName=sc.nextLine();

        System.out.println("Enter adress: ");
        String address=sc.nextLine();

        System.out.println("Enter city: ");
        String city=sc.nextLine();

        System.out.println("Enter state: ");
        String state=sc.nextLine();

        System.out.println("Enter zip: ");
        String zip=sc.nextLine();

        System.out.println("Enter phoneNumber: ");
        String phoneNumber=sc.nextLine();

        System.out.println("Enter email: ");
        String email=sc.nextLine();

        AddressBookSystem book=new AddressBookSystem(firstName , lastName, address, city, state, zip, phoneNumber, email);
        list.add(book);
        System.out.println("Contact details added Sucessfully!");


     }


    
}
