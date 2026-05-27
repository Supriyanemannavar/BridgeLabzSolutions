package ArrayProblems;
import java.util.HashMap;


public class Elementfrequency {
    
    


    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 10};

        findFrequency(arr);
    }

    public static void findFrequency(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Integer key : map.keySet()) {
            System.out.println(key + " occurs " + map.get(key) + " times");
        }
    }
}
    

