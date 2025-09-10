public class NarrowingConversion {

    // Narrowing Conversion
    // short -byte, char
    // char- byte, short
    // int -byte, short, char
    // long -byte, short, char, int
    // float -byte, short, char, int, long
    // double -float, byte, short, char, int, long

    public static void main(String[] args) {
        // ------this a narrowing or explicity coversion that large into small data
        // conversion loose the some data
        // Double > Float > Long > int > short > byte
        double d = 122232.22;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;

        System.out.println("double : " + d);
        System.out.println("float : " + f);
        System.out.println("long : " + l);
        System.out.println("int : " + i);
        System.out.println("short : " + s);
        System.out.println("byte : " + b);

    }

}
