public class Wrapper {
     public static void main(String[] args) {
         int a = 10;
        // Auto Boxing = convert primitive -> object
       Integer b = a;
        // UnBoxing = object -> primitive 
         int c =b;
        System.out.println("initial value : " + a+ "\nInteger value : " + b + "\nprimitive : " + c);
     }
}
