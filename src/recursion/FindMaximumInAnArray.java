package recursion;

public class FindMaximumInAnArray {
    
    public static int findMax(int[] arr, int n) {
        int maxIndx = n - 1;

        if (n == 1) {
            return arr[0];
        }
        else if (arr[n - 2] > arr[maxIndx]) {
            maxIndx = n - 2;
        }
        return findMax(arr, n - 1);
    }
    public static void main(String[] args) {
        System.out.println(findMax(new int[] {2, 4, 6, 4, 1}, 3));
    }
}
