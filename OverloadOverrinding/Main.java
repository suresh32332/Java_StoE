// overloading 
class Test {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(double a, double b) {
        System.out.println(a + b);
    }
}

// Overrinding
class Parent {
    void run() {
        System.out.println("running slow ....");
    }
}

class Child extends Parent {
    void run() {
        System.out.println("running fast...");
    }

}

public class Main {
    public static void main(String[] args) {
        Test obj = new Test();
        // same name but different arguments called the overloading
        obj.sum(5, 6);
        obj.sum(50.0, 50.0);

        // overrinding - child class define the own implemention but already define the parent class
        Parent obj1 = new Parent();
        Parent obj3 = new Child();

        obj1.run();
        obj3.run();

    }
}
