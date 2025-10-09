public class ArrayProblem {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 6, 9, 7, 4, 8 };
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            // System.out.print(arr[i] + " ");
        }
        sum = sum / n;
        System.out.println(sum);

        // int min = arr[0];
        // for (int j = 0; j < arr.length; j++) {
        // if (arr[j] > min) {
        // min = arr[j];
        // }
        // }
        // System.out.println(min);
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length - 1; j++) {
        // if (arr[j + 1] < arr[j]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }
        // for (int a : arr) {
        // System.out.println(arr[a]);
        // }
    }

}
