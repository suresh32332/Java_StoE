public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuilder s = new StringBuilder();
        sb.append("suresh"); // concatenate
        sb.append(" t"); // concatenate string
        System.out.println(sb.delete(0, 1)); // delete the starting index and ending index
        System.out.println(sb.replace(0, 1, "S")); // replace the string specify index posistion
        System.out.println("reverse : " + sb.reverse()); // reveres string
        System.out.println("length : " + sb.length()); // find the length or size of string
        System.out.println("copacity : " + sb.capacity()); // capacity - defualt 16 and y can expan the 16 *2 + 2 =34
        System.out.println(sb.charAt(3)); // find single char specify the index posistion
        System.out.println(sb.codePointAt(3)); // unique code pointer

        System.out.println(sb.deleteCharAt(3));

    }
}
