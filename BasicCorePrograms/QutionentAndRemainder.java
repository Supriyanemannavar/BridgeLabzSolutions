package BasicCorePrograms;

import java.util.Scanner;

public class QutionentAndRemainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dividend:");
        int dividend = sc.nextInt();

        System.out.println("Enter divisor:");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero");
            return;
        }

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

       
    }
    
}
