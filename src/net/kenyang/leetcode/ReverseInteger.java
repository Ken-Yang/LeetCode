package net.kenyang.leetcode;

/**
 * Reverse digits of an integer. </br>
 * </br>
 * Example1: x = 123, return 321 </br>
 * Example2: x = -123, return -321
 * 
 * @author Ken Yang
 *
 */
public class ReverseInteger {

    public static void main(String[] args) {
        new ReverseInteger();
    }

    public ReverseInteger() {
        System.out.println(reverse(-1563847412));
        System.out.println(reverse(1));
    }

    public int reverse(int x) {
        if (x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) {
            return 0;
        }
        
        final int MAX_1 = Integer.MAX_VALUE/10;
        final int MAX_2 = Integer.MAX_VALUE%10;
        

        final int MIN_1 = Integer.MIN_VALUE/10;
        final int MIN_2 = Integer.MIN_VALUE%10;

        int newValue = 0;
        while (x != 0) {
            final int mod = x % 10;

            if ((newValue > MAX_1 || newValue == MAX_1 && mod > MAX_2) 
                    || (newValue < MIN_1 || newValue == MIN_1 && mod < MIN_2)) {
                newValue = 0;
                break;
            }

            newValue = newValue * 10 + mod;
            
            x /= 10;

        }
        return newValue;
    }
}
