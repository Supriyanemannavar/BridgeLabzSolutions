package Whileloop;

public class Sum {
    
    public static void main(String args[]) {
        int n = 5;
       
        int sum = 0;

        while (n>0) {
            sum = sum + n;
            n--;
        }

        System.out.println("Sum of natural numbers = " + sum);
    }
}
    

