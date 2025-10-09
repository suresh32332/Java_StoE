public class Random {
    public static void main(String[] args) {
        int a = 5;

        int random = (int) (Math.random() * 10); // the randoms is return the decimal value

        System.out.println(random);

        // calculate area
        double area = Math.PI * Math.pow(a, 2); // pai * r^2 = ans
        System.out.println(area);

        // radians

        int b = 360;
        System.out.println("Radians : " + Math.toRadians(b));

        // math PI vale and E value
        System.out.println("Pai value : " + Math.PI);
        System.out.println("exponsal value : " + Math.E);

        System.out.println("--------------------random value ---------------------");
        int ran = (int) (Math.random() * 100); // 1 to 99
        System.out.println(ran);
    }
}
