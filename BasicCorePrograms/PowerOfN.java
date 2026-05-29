package BasicCorePrograms;

public class PowerOfN {
    public static void main(String args[]) {

        int n = Integer.parseInt(args[0]);

        int i = 0;

        while (i >= 0 && i <= n && n < 31) {

            double val = Math.pow(2, i);

            System.out.println("2^" + i + " = " + (int)val);

            i++;
        }
    }
    
}
