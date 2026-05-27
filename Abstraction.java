public class Abstraction {
    static abstract class Animal {

    abstract void sound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

static class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}
public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.sleep();
    }
    
}
