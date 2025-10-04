public class MathClass {
    public static void main(String[] args) {
        // mathametical function and contaits
        // without create a object becaues of all method is static
        double a = 12.85;
        System.out.println("round  :" + Math.round(a)); // return the int
        System.out.println("floor :" + Math.floor(a)); // not cosider the decimal value
        System.out.println("ceil :" + Math.ceil(a)); // return the double

        // absolue & sign
        int x = 0;
        System.out.println("absolute : " + Math.abs(x)); // converted the negative to positive value
        System.out.println("signma : " + Math.signum(x));

    }

}
