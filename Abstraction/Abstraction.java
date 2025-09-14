abstract class Text {
    static String str = "java";

    abstract void show(); // this is create method inside of the abstraction class and abstract method
}

class Text1 extends Text {
    // this is inherit the text class and implement the method
    void show() {
        System.out.println("welcome");

    }
}

public class Abstraction {

    public static void main(String[] args) {
        Text obj = new Text1();
        System.out.println(Text.str);
        obj.show();

    }
}
