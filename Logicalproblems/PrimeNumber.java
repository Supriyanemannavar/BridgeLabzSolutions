package Logicalproblems;

public class PrimeNumber {
    public static void main(String args[]){
        int n=9;

        if(prime(n)){
            System.out.println("The give number is prime number");
        }
        else{
            System.out.println("The given number is not prime number");
        }
    }

    public static boolean prime(int n){
        if(n==1){
            return false;
        }

        double num=Math.sqrt(n);

        for(int i=2;i<=num;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}
