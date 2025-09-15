class CreateClass {
    String str = "ThinkInJava";
    // constructor
    public CreateClass() {
        this.str = str; // this is current object or method or variable
    }
}
public class DemoClass {
    public static void main(String[] args) {
        // object creation using the new keyword 
        CreateClass obj = new CreateClass();
        System.out.println(obj.str);
    }
}
