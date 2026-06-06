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
    public T testMaximum() {
        return testMaximum(x, y, z);
    }

    // UC1, UC2, UC3
    public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {

        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        printMax(max);
        return max;
    }

    // UC4 - More than 3 parameters
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

    // UC5
    public static <T> void printMax(T max) {
        System.out.println("Maximum Value : " + max);
    }

    public static void main(String[] args) {

        // Integer Test Cases
        MaximumTest<Integer> int1 = new MaximumTest<>(30, 20, 10);
        int1.testMaximum();

        MaximumTest<Integer> int2 = new MaximumTest<>(10, 30, 20);
        int2.testMaximum();

        MaximumTest<Integer> int3 = new MaximumTest<>(10, 20, 30);
        int3.testMaximum();

        // Float Test Cases
        MaximumTest<Float> float1 = new MaximumTest<>(30.5f, 20.5f, 10.5f);
        float1.testMaximum();

        MaximumTest<Float> float2 = new MaximumTest<>(10.5f, 30.5f, 20.5f);
        float2.testMaximum();

        MaximumTest<Float> float3 = new MaximumTest<>(10.5f, 20.5f, 30.5f);
        float3.testMaximum();

        // String Test Cases
        MaximumTest<String> str1 = new MaximumTest<>("Peach", "Banana", "Apple");
        str1.testMaximum();

        MaximumTest<String> str2 = new MaximumTest<>("Apple", "Peach", "Banana");
        str2.testMaximum();

        MaximumTest<String> str3 = new MaximumTest<>("Apple", "Banana", "Peach");
        str3.testMaximum();

        // More than 3 values
        testMaximum(10, 20, 30, 40, 50, 60);

        testMaximum(10.5f, 20.5f, 30.5f, 40.5f, 50.5f);

        testMaximum("Apple", "Banana", "Peach", "Orange", "Mango");
    }
}