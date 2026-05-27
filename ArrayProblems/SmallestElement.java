package ArrayProblems;

public class SmallestElement {
    
    public static void main(String[] args) {

        int[] arr = {45, 12, 78, 3, 56};

        int min = arr[0];  // assume first element is smallest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest element is: " + min);
    }
}
    

