package net.kenyang.leetcode;
    
/**
 * 
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * </br></br>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * @author Ken Yang
 *
 */
public class SingleNumber {
    
    public static void main(String[] args) {
        new SingleNumber();
    }
    
    public SingleNumber() {
        System.out.println(singleNumber(new int[]{5,2,4,5,4}));;
    }
    
    public int singleNumber(int[] nums) {
        
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }
        return num;
    }
}
