package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
public class _13_RomanToInteger {

    Map<Character, Integer> romans = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int res = 0;

        int i = 0;
        char[] chars = s.toCharArray();
        while (i < chars.length - 1) {
            if (chars[i] == 'I') {
                if (chars[i + 1] == 'V') {
                    res += 4;
                    i += 2;
                } else if (chars[i + 1] == 'X') {
                    res += 9;
                    i += 2;
                } else {
                    res += 1;
                    i++;
                }
            } else if (chars[i] == 'X') {
                if (chars[i + 1] == 'L') {
                    res += 40;
                    i += 2;
                } else if (chars[i + 1] == 'C') {
                    res += 90;
                    i += 2;
                } else {
                    res += 10;
                    i++;
                }
            } else if (chars[i] == 'C') {
                if (chars[i + 1] == 'D') {
                    res += 400;
                    i += 2;
                } else if (chars[i + 1] == 'M') {
                    res += 900;
                    i += 2;
                } else {
                    res += 100;
                    i++;
                }
            } else {
                res += romans.get(chars[i]);
                i++;
            }
        }
        if (i < chars.length) {
            res += romans.get(chars[i]);
        }

        return res;
    }
}