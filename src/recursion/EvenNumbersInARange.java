package recursion;

public class EvenNumbersInARange {
    
    public static void printEvens(int start, int end) {
        
        int evenStart = start;
        int evenEnd = end;
        
        if (start % 2 != 0) {
            evenStart++;
        }
        if (end % 2 != 0) {
            evenEnd--;
        }
        if (evenStart == evenEnd) {
            System.out.print(evenStart);
        } else {
            System.out.print(evenStart);
            printEvens(evenStart + 2, evenEnd);
        }
    }
    public static void main(String[] args) {
        printEvens(1, 11);
    }
}
