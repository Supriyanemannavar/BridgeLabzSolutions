package AddressBookSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Book5 {
    static ArrayList<AddressBookSystem> list = new ArrayList<>();

    public static class AddressBookSystem {

        String firstName;
        String lastName;
        String address;
        String city;
        String state;
        String zip;
        String phoneNumber;
        String email;

        public AddressBookSystem(String firstName, String lastName,
                                 String address, String city,
                                 String state, String zip,
                                 String phoneNumber, String email) {

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

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //Add Contact
        System.out.println("Enter First Name:");
        String firstName = sc.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = sc.nextLine();

        System.out.println("Enter Address:");
        String address = sc.nextLine();

        System.out.println("Enter City:");
        String city = sc.nextLine();

        System.out.println("Enter State:");
        String state = sc.nextLine();

        System.out.println("Enter Zip:");
        String zip = sc.nextLine();

        System.out.println("Enter Phone Number:");
        String phoneNumber = sc.nextLine();

        System.out.println("Enter Email:");
        String email = sc.nextLine();

        AddressBookSystem book = new AddressBookSystem(
                firstName,
                lastName,
                address,
                city,
                state,
                zip,
                phoneNumber,
                email);

        list.add(book);

        System.out.println("Contact Added Successfully!");

        //Edit Contact
        System.out.println("\nEnter First Name to Edit:");
        String editName = sc.nextLine();

        boolean found = false;

        for (AddressBookSystem contact : list) {

            if (contact.firstName.equalsIgnoreCase(editName)) {

                found = true;

                System.out.println("Enter New Address:");
                contact.address = sc.nextLine();

                System.out.println("Enter New City:");
                contact.city = sc.nextLine();

                System.out.println("Enter New State:");
                contact.state = sc.nextLine();

                System.out.println("Enter New Zip:");
                contact.zip = sc.nextLine();

                System.out.println("Enter New Phone Number:");
                contact.phoneNumber = sc.nextLine();

                System.out.println("Enter New Email:");
                contact.email = sc.nextLine();

                System.out.println("Contact Updated Successfully");
                break;
            }
        }

        if (!found) {
            System.out.println("Contact Not Found");
        }

        // UC4 - Delete Contact
        System.out.println("\nEnter First Name to Delete:");
        String deleteName = sc.nextLine();

        boolean deleted = false;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).firstName.equalsIgnoreCase(deleteName)) {

                list.remove(i);
                deleted = true;

                System.out.println("Contact Deleted Successfully");
                break;
            }
        }

        if (!deleted) {
            System.out.println("Contact Not Found");
        }
    
}
}
