public class Q4_B_PalindromeCheck {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("Is '" + str + "' a palindrome? " + isPalindrome(str, 0, str.length() - 1));
    }
    
    public static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindrome(s, left + 1, right - 1);
    }
}