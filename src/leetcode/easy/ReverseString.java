package leetcode.easy;

/**
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {

    public void reverseString(char[] s) {
        int center = s.length / 2;
        for (int i = 0; i < center; i++) {
            char tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }

}