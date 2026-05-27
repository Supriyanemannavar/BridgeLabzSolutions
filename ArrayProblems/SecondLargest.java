package ArrayProblems;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {10, 50, 20, 80, 30};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } 
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element exists");
        } else {
            System.out.println("Second largest element is: " + second);
        }
    }
    
}
