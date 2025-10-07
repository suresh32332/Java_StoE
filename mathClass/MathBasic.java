public class MathBasic {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(Math.max(a, b)); // 10 max value
        System.out.println(Math.min(a, b)); // 5 min value

        // Exact
        System.out.println(Math.addExact(a, b)); // 15 add a + b =15
        System.out.println(Math.subtractExact(a, b)); // 5 sub a-b = 5
        System.out.println(Math.multiplyExact(a, b)); // 50
        System.out.println(Math.incrementExact(a)); // increment the 11
        System.out.println(Math.decrementExact(b)); // decrement the b 4

        System.out.println("---------power and root");

        System.out.println(Math.pow(3, 2)); // return the double value 9.0
        System.out.println(Math.sqrt(25)); // return the double the value 5.0
        System.out.println(Math.cbrt(27)); // return the double value 3.0
        System.out.println(Math.hypot(4, 6)); // 4^2 + 6^2 =16 + 36 = root of 52 -> 7.21110...

        // logarithmic

    }

}
