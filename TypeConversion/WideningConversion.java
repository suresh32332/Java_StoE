class WideningCoversion {

    // Widening conversion
    // byte -short, int, long, float, double
    // short -int, long, float, double
    // char -int, long, float, double
    // int -long, float, double
    // long -float, double
    // float -double
    public static void main(String[] args) {
        // ------------------------------ This widening 0r implicity conversion
        // automatically small into large data type ------------
        // byte > short > int > long > float > double
                  // char>|
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("byte : " + b);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
        System.out.println("float : " + f);
        System.out.println("double : " + d);
    }
}