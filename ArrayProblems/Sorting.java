package ArrayProblems;

public class Sorting {
    public static void main(String[] args) {

        int[] arr = {50, 20, 40, 10, 30};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                  
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array in ascending order:");

        for (int num : arr) {
            System.out.println(num);
        }
    }
    
}
