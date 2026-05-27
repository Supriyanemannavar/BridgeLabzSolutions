package IfElseproblem;

public class UnitTenHundred {
    public static void main(String args[]){
        int n = 10000123;
        int count = 0;

        while (n > 0 && count < 3) {
            int num = n % 10;
            count++;
            n = n / 10;
        if (n == 0) {
                System.out.println("Zero");
            } 
            else if (n== 1) {
                System.out.println("One");
            } 
            else if (n == 2) {
                System.out.println("Two");
            } 
            else if (n== 3) {
                System.out.println("Three");
            } 
            else if (n== 4) {
                System.out.println("Four");
            } 
            else if (n== 5) {
                System.out.println("Five");
            } 
            else if (n== 6) {
                System.out.println("Six");
            } 
            else if (n== 7) {
                System.out.println("Seven");
            } 
            else if (n == 8) {
                System.out.println("Eight");
            } 
            else if (n== 9) {
                System.out.println("Nine");
            } 
            else {
                System.out.println("Invalid Input");
            }
        }
    }

}
                
       

