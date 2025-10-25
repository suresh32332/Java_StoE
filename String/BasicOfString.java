class BasicOfString {
    public static void main(String[] args) {
        String s = "Hello Developers";
        String s2 = "texlt hello";

        char[] ch = s2.toCharArray();
        for (char c : ch) {
            System.out.println(c);
        }

        System.out.println(s.length()); // find length of string
        System.out.println(s.charAt(1)); // specify char index postion
        System.out.println(s.substring(6)); // starting index positon to ending substring
        System.out.println(s.substring(6, 15)); /// specify substring
        System.out.println(s.concat("???")); // to string merge
        System.out.println(s.equals("hello developers")); // compare the two string equals or not equals return t or f
        System.out.println(s.equalsIgnoreCase("hello developers")); // u or l case does not matter consider the both
        System.out.println(s2.indexOf("l", 3)); // find the idext
        System.out.println(s.lastIndexOf("e")); // last form index position
        System.out.println(s2.replace('l', '1')); // replace specify position add new char
        System.out.println(s2.contains("hello")); // do have word return t or f

    }
}