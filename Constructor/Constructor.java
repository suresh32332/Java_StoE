class Demo {
    // constructor name is must be same class that is role in java
    int a;
    String name;

    // this no argument construtor
    Demo() {
        System.out.println("no argument constructor.");
    }

    // this a parameterized constructor pass the some values
    Demo(int a, String name) {
        this.a = a;
        this.name = name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Demo obj = new Demo(); // when a create object every time called the constructor

        Demo obj1 = new Demo(1, "parathesess constructor called "); //pass the argument and some values 
        System.out.println(obj1.a + " " + obj1.name);

    }
}
