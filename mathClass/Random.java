public class Random {
    public static void main(String[] args) {
        int a = 5;

        int random = (int) (Math.random() * 10);

        System.out.println(random);

        // calculate area
        double area = Math.PI * Math.pow(a, 2); // pai * r^2 = ans
        System.out.println(area);

        // radians

        int b = 360;
        System.out.println("Radians : " + Math.toRadians(b));

    }
}
