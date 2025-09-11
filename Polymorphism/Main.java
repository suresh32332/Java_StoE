class OverloadPolymorphism {
    void method(String x, String y) {
        System.out.println(x + y);
    }

    void method(int a, int b) {
        System.out.println(a + b);

    }
}

// -------overrinding polymorphism -----------
// parent class
class Computer {
    void print() {
        System.out.println("its computer class");
    }
}

// child class
class Laptop extends Computer {
    void print() {
        System.out.println("its laptop class");
    }
}

// child class
class Mac extends Computer {
    void print() {
        System.out.println("its mac class");
    }
}

public class Main {
    public static void main(String[] args) {

        // overload polymorphism  object create
        OverloadPolymorphism obj = new OverloadPolymorphism();
        obj.method("think", "injava");
        obj.method(5, 05);

        // overrining polymorphism object create 
        Computer obj1;

        obj1 = new Laptop();
        obj1.print();

        obj1 = new Mac();
        obj1.print();
    }
}
