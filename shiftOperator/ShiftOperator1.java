public class ShiftOperator1{
   public static void main (String [] args){

      System.out.println("shift Operator ");

            int a = 20;          // 0  1 0  1 
            int b = a >> 3;     // 0  0 1  0  this right shift   a / 2^1 = 2 
	System.out.println(b); // 2   --> a * 2 


      int x = 10 ;          //1 0 1 0
      int y = x << 2 ;   //1 0 1 0 0    this is left shift 
    System.out.println(y);  // x * 2 ^ 2 = 40 


}

}