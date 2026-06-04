package DAY10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

    static class Contact {

        String firstName;
        String lastName;
        String address;
        String city;
        String state;
        String zip;
        String phoneNumber;
        String email;

        Contact(String firstName, String lastName, String address,
                String city, String state, String zip,
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

        void display() {
            System.out.println("First Name : " + firstName);
            System.out.println("Last Name  : " + lastName);
            System.out.println("Address    : " + address);
            System.out.println("City       : " + city);
            System.out.println("State      : " + state);
            System.out.println("Zip        : " + zip);
            System.out.println("Phone No   : " + phoneNumber);
            System.out.println("Email      : " + email);
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Multiple Address Books
        HashMap<String, ArrayList<Contact>> addressBooks = new HashMap<>();

        System.out.println("Welcome to Address Book Program");

        while (true) {

            System.out.println("\n1. Create Address Book");
            System.out.println("2. Add Contact");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Display Contacts");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Address Book Name: ");
                    String bookName = sc.nextLine();

                    addressBooks.put(bookName, new ArrayList<>());
                    System.out.println("Address Book Created");
                    break;

                case 2:

                    System.out.print("Enter Address Book Name: ");
                    bookName = sc.nextLine();

                    if (!addressBooks.containsKey(bookName)) {
                        System.out.println("Address Book Not Found");
                        break;
                    }

                    System.out.print("First Name: ");
                    String firstName = sc.nextLine();

                    System.out.print("Last Name: ");
                    String lastName = sc.nextLine();

                    System.out.print("Address: ");
                    String address = sc.nextLine();

                    System.out.print("City: ");
                    String city = sc.nextLine();

                    System.out.print("State: ");
                    String state = sc.nextLine();

                    System.out.print("Zip: ");
                    String zip = sc.nextLine();

                    System.out.print("Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    Contact contact = new Contact(
                            firstName, lastName, address,
                            city, state, zip, phone, email);

                    addressBooks.get(bookName).add(contact);

                    System.out.println("Contact Added Successfully");
                    break;

                case 3:

                    System.out.print("Enter Address Book Name: ");
                    bookName = sc.nextLine();

                    System.out.print("Enter First Name to Edit: ");
                    String editName = sc.nextLine();

                    for (Contact c : addressBooks.get(bookName)) {

                        if (c.firstName.equalsIgnoreCase(editName)) {

                            System.out.print("New City: ");
                            c.city = sc.nextLine();

                            System.out.print("New Phone Number: ");
                            c.phoneNumber = sc.nextLine();

                            System.out.println("Contact Updated Successfully");
                            break;
                        }
                    }
                    break;

                case 4:

                    System.out.print("Enter Address Book Name: ");
                    bookName = sc.nextLine();

                    System.out.print("Enter First Name to Delete: ");
                    String deleteName = sc.nextLine();

                    ArrayList<Contact> contacts = addressBooks.get(bookName);

                    for (int i = 0; i < contacts.size(); i++) {

                        if (contacts.get(i).firstName.equalsIgnoreCase(deleteName)) {

                            contacts.remove(i);
                            System.out.println("Contact Deleted Successfully");
                            break;
                        }
                    }
                    break;

                case 5:

                    System.out.print("Enter Address Book Name: ");
                    bookName = sc.nextLine();

                    if (!addressBooks.containsKey(bookName)) {
                        System.out.println("Address Book Not Found");
                        break;
                    }

                    for (Contact c : addressBooks.get(bookName)) {
                        c.display();
                    }
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
    
}
