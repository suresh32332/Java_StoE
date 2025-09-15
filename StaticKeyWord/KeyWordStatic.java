class Test {
    String empName = "manoj";
    int empId = 123;
    static String companyName = "java company"; // static variable

    void display() {
        System.out.println("name : " + empName + "\nId : " + empId + "\nCompany : " + companyName);
    }

    // static method
    public static void show() {
        System.out.println("its a static method ");
    }
}

public class KeyWordStatic {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();

        System.out.println("static variable : " + Test.companyName);// refer class name and direct called the static variable
                                                                    
        Test.show(); // without object - use the class + method name directly called
    }
}
