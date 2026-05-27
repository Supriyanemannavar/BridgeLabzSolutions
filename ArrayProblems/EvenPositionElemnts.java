package ArrayProblems;

public class EvenPositionElemnts {
    
     public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.println("Elements at even positions:");

        for (int i = 1; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
    }
}
