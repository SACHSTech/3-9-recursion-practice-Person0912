package recursion;

public class ArraySum {
    
    public static int sumArray(int[] arr, int n) { 
        if (n == 1) {
            return arr[0];
        }
        return sumArray(arr, n - 1) + arr[n - 1];
    }
    public static void main(String[] args) {
        System.out.println(sumArray(new int[] {0, 10, 1, 5, 8}, 4));
    }
}