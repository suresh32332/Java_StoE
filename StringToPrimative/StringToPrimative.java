public class StringToPrimative {
    public static void main(String[] args) {
        // converted String into primitive data type
        String a = "123";
        int num = Integer.parseInt(a);
        System.out.println(num);

        // converted primitive date into the String
        String str = String.valueOf(num);
        System.out.println("string  " + str);

    }

}
