package net.kenyang.leetcode;

import java.util.HashMap;

/**
 * Given a roman numeral, convert it to an integer.</br>
 * </br>
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * @author Ken Yang
 *
 */
public class RomantoInteger {

    public RomantoInteger() {
        System.out.println(romanToInt("DCXXI"));
        System.out.println(romanToInt("MCMXCVI"));
    }

    public static void main(String[] args) {
        new RomantoInteger();
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        hashmap.put('I', 1);
        hashmap.put('V', 5);
        hashmap.put('X', 10);
        hashmap.put('L', 50);
        hashmap.put('C', 100);
        hashmap.put('D', 500);
        hashmap.put('M', 1000);

        int length = s.length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if ((i + 1) < length && hashmap.get(s.charAt(i)) < hashmap.get(s.charAt(i + 1))) {
                sum -= hashmap.get(s.charAt(i));
            } else {
                sum += hashmap.get(s.charAt(i));
            }
        }

        return sum;
    }

}
