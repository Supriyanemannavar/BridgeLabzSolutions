package Whileloop;

public class PalindromeNumber {

    public static void main(String[] args) {

        int n = 121;
        int ori= n;
        int reverse = 0;

        while (n != 0) {

            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (ori== reverse) {
            System.out.println(ori + " is a Palindrome Number");
        } else {
            System.out.println(ori+ " is not a Palindrome Number");
        }
    }
}