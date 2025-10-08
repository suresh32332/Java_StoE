public class Trigonometic {
    public static void main(String[] args) {
        System.out.println(Math.toRadians(180)); // radians = degree x PI / 180

        System.out.println("auctal " + Math.sin(90));
        System.out.println("auctal use radians " + Math.sin(Math.toRadians(90)));

        // cos degree value and converted
        System.out.println(Math.cos(Math.toRadians(60)));
        System.out.println(Math.toDegrees(Math.acos(0.5)));

        // tan
        System.out.println(Math.tan(Math.toRadians(45)));
    }

}
