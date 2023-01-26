public class isPalindrome {
    public static boolean isPalindrome(int integer) {
        int palindrome = integer;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return integer == reverse;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));

    }
}
