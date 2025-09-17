interface Test{
    // interface all attributes and method defualt final , static and public and same abstraction
    //method is without body 
   void start();
   int a =10;
}
interface Exam {
    void examName();
}
// you can use the multipe interface 
class A implements Test,Exam{
    public void start() {
        System.out.println("text started at 11.00am..");
    }
   public void examName(){
 System.out.println("this ipbs exam ");
    }
}
public class Interface {
    public static void main(String[] args) {
      A obj = new A();
      obj.start();
      obj.examName();
        
    }
    
}
