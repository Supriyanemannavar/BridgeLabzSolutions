
public class Inheritance {


	static class Animal {


    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Child class inherits Animal class
static class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();

        // Inherited method
        d.sound();

        // Child class method
        d.bark();
    }
}
}



