package JUnitTestingProblems;

public class DecimalToBinary {
    public static String toBinary(int n) {

        String binary = "";

        int num = n;

       
        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }

        
        while (binary.length() < 32) {
            binary = "0" + binary;
        }

        return binary;
    }

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        String result = toBinary(n);

        System.out.println("Binary of " + n + " = " + result);
    }
    
}
