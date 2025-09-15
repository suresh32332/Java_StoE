
class A implements Cloneable {
    String str = "think in java";
    int a = 10;

    public A clone() throws CloneNotSupportedException {
        return (A) super.clone(); // call the clone object
    }
}

public class CloneClass {
    public static void main(String[] args) {
        A obj = new A();
        try {
            A obj1 = obj.clone();
            System.out.println("originla : " + obj.a + "+ " + obj.str);
            System.out.println("clone : " + obj1.a + "+ " + obj.str);
            System.out.println("two equals :  " + (obj == obj1));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
