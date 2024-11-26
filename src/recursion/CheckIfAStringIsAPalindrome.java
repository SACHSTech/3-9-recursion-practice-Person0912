package recursion;

public class CheckIfAStringIsAPalindrome {
    public static boolean isPalindrome(String s) {
        
        // WHY DOESN'T MY CODE WORK AHHHH
        if (s.equals("") || s.length() == 1) {
            return true;
        }
        else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("peep"));
    }
}
