import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter no : ");
         int day =sc.nextInt();
   
        switch(day) {
            case 1:
               System.out.println("sunday");
               break;
               case 2:
               System.out.println("monday");
               break;
               case 3:
               System.out.println("tuesday");
               break;

               case 4:
               System.out.println("wednesday");
               break;
               case 5:
               System.out.println("thursday");
               break;
               case 6:
               System.out.println("friday");
               break;

               case 7:
               System.out.println("saturday");
               break;
        }
        sc.close();
    }
    
}
