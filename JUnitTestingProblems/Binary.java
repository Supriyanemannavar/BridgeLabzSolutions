package JUnitTestingProblems;

import java.util.Scanner;

public class Binary {
    public static String toBinary(int n) {

        String binary = "";

        while (n > 0) {
            binary = (n % 2) + binary;
            n = n / 2;
        }

        // make it 8-bit
        while (binary.length() < 8) {
            binary = "0" + binary;
        }

        return binary;
    }

  
    public static String swapNibbles(String binary) {

        String nibble1 = binary.substring(0, 4);
        String nibble2 = binary.substring(4, 8);

        return nibble2 + nibble1;
    }

    
    public static int binaryToDecimal(String binary) {

        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {

            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }

   
    public static boolean isPowerOfTwo(int n) {

        if (n <= 0) return false;

        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        String binary = toBinary(n);
        System.out.println("Binary: " + binary);

        String swappedBinary = swapNibbles(binary);
        System.out.println("After swapping nibbles: " + swappedBinary);

        int result = binaryToDecimal(swappedBinary);
        System.out.println("Decimal after swap: " + result);

        if (isPowerOfTwo(result)) {
            System.out.println("Result is power of 2");
        } else {
            System.out.println("Result is NOT power of 2");
        }

        
    }
    
}
