package DAY13;

public class MaximumTest<T extends Comparable<T>> {

    private T x;
    private T y;
    private T z;

    // Constructor
    public MaximumTest(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Instance Method
            max = z;
        }

        printMax(max);
        return max;
    }

  
    public static <T extends Comparable<T>> T testMaximum(T... values) {

        T max = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(max) > 0) {
                max = values[i];
            }
        }

        printMax(max);
        return max;
    }


    public static <T> void printMax(T max) {
        System.out.println("Maximum Value : " + max);
    }

    public static void main(String[] args) {

        //Max at 1st Position
        MaximumTest<Integer> int1 =new MaximumTest<>(30, 20, 10);
        int1.testMaximum();

        // Max at 2nd Position
        MaximumTest<Integer> int2 =new MaximumTest<>(10, 30, 20);
        int2.testMaximum();

        // Max at 3rd Position
        MaximumTest<Integer> int3 =new MaximumTest<>(10, 20, 30);
        int3.testMaximum();

        // Max at 1st Position
        MaximumTest<Float> float1 =new MaximumTest<>(30.5f, 20.5f, 10.5f);
        float1.testMaximum();

        // Max at 2nd Position
        MaximumTest<Float> float2 =new MaximumTest<>(10.5f, 30.5f, 20.5f);
        float2.testMaximum();

        //Max at 3rd Position
        MaximumTest<Float> float3 =new MaximumTest<>(10.5f, 20.5f, 30.5f);
        float3.testMaximum();

        // Max at 1st Position
        MaximumTest<String> str1 =new MaximumTest<>("Peach", "Banana", "Apple");
        str1.testMaximum();

        // Max at 2nd Position
        MaximumTest<String> str2 =new MaximumTest<>("Apple", "Peach", "Banana");
        str2.testMaximum();

        //  Max at 3rd Position
        MaximumTest<String> str3 =new MaximumTest<>("Apple", "Banana", "Peach");
        str3.testMaximum();

        testMaximum(10, 20, 30, 40, 50, 60);

        testMaximum(10.5f, 20.5f, 30.5f, 40.5f, 50.5f);

        testMaximum("Apple","Banana","Peach","Orange","Mango");
    }
}