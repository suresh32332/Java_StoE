class A {
    static int a = 10;
    static String name = "name";
}

public class Main {
    // static keyword mainly use for the memory mangement
    static {
        System.out.println("hello its static..");
    }

    public static void main(String[] args) {

        // without create object you can achive call the and print the values
        System.out.println(A.a + " " + A.name);

    }
}
