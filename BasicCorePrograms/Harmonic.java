package BasicCorePrograms;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N:");
        int n = sc.nextInt();

        // Check N is not zero
        if (n == 0) {
            System.out.println("N should not be zero");
            return;
        }

        double harmonic = 0.0;

        int i = 1;

        while (i <= n) {

            harmonic = harmonic + (1.0 / i);

            i++;
        }

        System.out.println("Nth Harmonic Value = " + harmonic);

        
    }
    
}
