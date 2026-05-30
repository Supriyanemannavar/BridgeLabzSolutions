package JUnitTestingProblems;

public class SqrtNewtonMethod {
    public static double sqrt(double c) {

        double epsilon = 1e-15;
        double t = c;

        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }

        return t;
    }

    public static void main(String[] args) {

        double c = Double.parseDouble(args[0]);

        double result = sqrt(c);

        System.out.println("Square root of " + c + " = " + result);
    }
    
}
