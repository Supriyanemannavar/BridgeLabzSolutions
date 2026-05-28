package OperatorProblems;

public class Distance {
    public static void main(String args[]){
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        double Distance=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.println("Euclidean distance: "+Distance);
    }
    
}
