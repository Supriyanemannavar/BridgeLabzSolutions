package Logicalproblems;

public class PerfectNumber {
    public static void main(String args[]){
        int n=28;

        int sum=0;
        int i=1;
        while(i<n){
            if(n%i==0){
                sum+=i;
            }
            i++;
        }

        if(sum==n){
            System.out.println("The given number is perfect number");
        }
        else{
            System.out.println("The given number is not perfect number");
        }
    }
    
}
