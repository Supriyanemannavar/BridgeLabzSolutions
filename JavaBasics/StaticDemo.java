package JavaBasics;

public class StaticDemo {

    // Static variable
    static int count = 10;

    // Static block
    static {
        System.out.println("Static block executed");
        count = 20;
    }

    // Static method
    static void display() {
        System.out.println("Static method called");
        System.out.println("Count value: " + count);
    }

    public static void main(String[] args) {

        System.out.println("Main method executed");

        // Calling static method
        display();
    }
}
