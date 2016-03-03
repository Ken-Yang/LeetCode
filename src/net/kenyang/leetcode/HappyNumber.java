package net.kenyang.leetcode;

import java.util.HashMap;

/**
 * Write an algorithm to determine if a number is "happy". A happy number is a
 * number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits, and repeat the
 * process until the number equals 1 (where it will stay), or it loops endlessly
 * in a cycle which does not include 1. Those numbers for which this process
 * ends in 1 are happy numbers. Example: 19 is a happy number 1^2 + 9^2 = 82 8^2
 * + 2^2 = 68 6^2 + 8^2 = 100 1^2 + 0^2 + 0^2 = 1
 * 
 * @author kencyang
 *
 */
public class HappyNumber {

    public HappyNumber() {
        System.out.println(isHappy(19));
    }

    public static void main(String[] args) {
        new HappyNumber();
    }

    public boolean isHappy(int n) {
        HashMap<Integer, Boolean> h = new HashMap<>();
        while (n != 1 && h.get(n) == null) {
            h.put(n, true);
            final String strTmp = String.valueOf(n);
            n = 0;
            for (char c : strTmp.toCharArray()) {
                int iTmp = Character.getNumericValue(c);
                n = n + (iTmp * iTmp);
            }
        }
        return n == 1;

    }
}
