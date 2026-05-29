package BasicCorePrograms;

import java.util.Scanner;

public class LeafYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year:");
        int year = sc.nextInt();

       
        if (year < 1000 || year > 9999) {
            System.out.println("Please enter a 4 digit year");
            return;
        }

        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }

        
    }
    
}
