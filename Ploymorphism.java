
public class Ploymorphism {


	static class MathOperation {


    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }
}


    public static void main(String[] args) {

        MathOperation m = new MathOperation();

        m.add(10, 20);
        m.add(10, 20, 30);
    }
}




