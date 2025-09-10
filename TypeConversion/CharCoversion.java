public class CharCoversion {
    public static void main(String[] args) {
        // char -> int > long >float > double
        char c = 'A';
        int i = c;
        long l = c;
        float f = c;
        double d = c;
        System.out.println("char : " + c);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
        System.out.println("float : " + f);
        System.out.println("double : " + d);

        System.out.println("-----------------------");
        //btye > short > char 
        byte b = 102;
        short s = 232;

        char ch = (char) b;
        char ch1 = (char) s;

        System.out.println("char : " + ch);
        System.out.println("ch1 : " + ch1);
    }
}
