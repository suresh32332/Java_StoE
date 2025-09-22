public class Array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        String str [] = {"java", "python","js","react", "html"};
        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("\narrys length : " + arr.length);
      // str used to the enhanced for loop 
      System.out.println("----------------------------------------------");
     for(String x : str) {
        System.out.println(x);
     }

    }

}
