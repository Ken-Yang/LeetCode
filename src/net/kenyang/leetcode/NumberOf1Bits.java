package net.kenyang.leetcode;

/**
 * Write a function that takes an unsigned integer and returns the number of ’1'
 * bits it has (also known as the Hamming weight). </br>
 * </br>
 * For example, the 32-bit integer ’11' has binary representation
 * 00000000000000000000000000001011, so the function should return 3.
 * 
 * @author Ken Yang
 *
 */
public class NumberOf1Bits {

    public NumberOf1Bits() {
        System.out.println(hammingWeight(0));
        System.out.println(hammingWeight(11));
        System.out.println(hammingWeight(2146483648+1000000));
    }

    public static void main(String[] args) {
        new NumberOf1Bits();
    }

    public int hammingWeight(int n) {
        
        // Solution 2
        System.out.println(Integer.toBinaryString(n));
        
        // Solution 1
        int bitCount = 0;
        long longn = Integer.toUnsignedLong(n);
        while (longn > 0) {
            if (longn % 2 == 1) {
                bitCount++;
            }

            longn = longn / 2;
        }

        return bitCount;
    }

}
