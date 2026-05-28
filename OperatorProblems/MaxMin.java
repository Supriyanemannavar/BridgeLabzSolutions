package OperatorProblems;

public class MaxMin {
    



    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 5;

        int num1= a + b * c;
        int num2 = c + a / b;
        int num3 = a % b + c;
        int num4 = a * b + c;

        int max = num1;
        int min = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        if (num4 > max) {
            max =num4;
        }

        if (num2 < min) {
            min = num2;
        }

        if (num3 < min) {
            min = num3;
        }

        if (num4 < min) {
            min = num4;
        }

        System.out.println("a + b * c = " + num1);
        System.out.println("c + a / b = " + num2);
        System.out.println("a % b + c = " + num3);
        System.out.println("a * b + c = " + num4);

        System.out.println("Maximum Value = " + max);
        System.out.println("Minimum Value = " + min);
    }
}
    

