import java.util.StringTokenizer;

public class StringTokenizerAndSplit {

    public static void main(String[] args) {
        String str = "http://wwww.suresht@java-java";
        // legacy class that three constructor 1 string only. 2 string and delimiter. 3
        // string, delimiter and boolean
        // StringTokenizer st = new StringTokenizer(str, "/", true);

        // while (st.hasMoreTokens()) { // hasMoreTokens is true or false in stringtoken

        // System.out.println(st.nextToken());
        // }

        String[] a = str.split("\\:|\\//|\\.|\\@|\\-");

        for (String s : a) {
            System.out.println(s);
        }
    }
}