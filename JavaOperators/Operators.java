
public class Operators {

    public static void main(String[] args) {
        // Arithmetic , Relational , Bitwise , Logical , assigment , Miscellaneous
        int a = 10;
        int b = 6;
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println("addition : " + add + "\nsubraction : " + sub + "\nmultiplication : " + mul + "\ndivison : "
                + div + "\nmoduls : " + mod);
        // -----------------------------------
        if (a == b) {
            System.out.println("equals ==");
        } else if (a != b) {
            System.out.println("not equals != ");
        } else if (a < b) {
            System.out.println("less then <");

        } else if (a > b) {
            System.out.println("greater then > ");

        } else if (a <= b) {
            System.out.println("less then equal <=");
        } else if (a >= b) {
            System.out.println("greater then equal >=");
        }
        // ---------------------------------------------
        if (a == b && a != b) { // both true
            System.out.println("and operation &&");
        } else if (a == b || a != b) { // any one true
            System.out.println("or operator ||");
        }
        // assigment operator
        int z = 2;
        z += 3; // z = z+ 3 ---- 5
        z -= 2; // z = z-2 ====3
        z *= 3; // z = z*3 ==== 9
        z /= 2; // z = z /2 ==== 4
        z %= 3; // z = Z% 3 ====1
        System.out.println("final : " + z);

    }
}
