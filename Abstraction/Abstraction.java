abstract class Text {
    abstract void show(); // this is create method inside of the abstraction class and abstract method
    void laptop() {
        System.out.println("this my pc");
    }
}
class Text1 extends Text {
    // this is inherit the text class and implement the method
    void show() {
        System.out.println("welcome");

    }
}
public class Abstraction {
        public static void main(String[] args) {
        Text1 obj = new Text1();
        obj.show();
        obj.laptop();

    }
}
