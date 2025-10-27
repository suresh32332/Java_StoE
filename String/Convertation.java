public class Convertation {
    public static void main(String[] args) {
        String str = "45";
        int i = Integer.parseInt(str);
        Double d = Double.parseDouble(str);

        String s = String.valueOf(d);
        System.out.println("that is string : " + s);

        // System.out.println(i % 10);
        // System.out.println(d);
    }

}
