package leetcode.easy;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class _9_PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int n = x;
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = (rev * 10) + r;
            n = n / 10;
        }
        return x == rev;
    }
}