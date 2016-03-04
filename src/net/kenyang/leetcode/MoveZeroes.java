/**
 * 
 */
package net.kenyang.leetcode;

/**
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements. </br>
 * </br>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
 * should be [1, 3, 12, 0, 0]. </br>
 * </br>
 * Note:</br>
 * 
 * You must do this in-place without making a copy of the array.</br>
 * Minimize the total number of operations.
 * 
 * @author Ken Yang
 *
 */
public class MoveZeroes {
    int[] nums = new int[] { 0, 1, 0, 3, 12 };
    public MoveZeroes() {
        
        moveZeroes(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new MoveZeroes();
    }

    public void moveZeroes(int[] nums) {
        final int iLength = nums.length;

        // solution 1
//        for (int i = 0; i < iLength - 1; i++) {
//            for (int j = i + 1; j < iLength; j++) {
//                if (nums[i] == 0) {
//                    final int iTmp = nums[j];
//                    nums[j] = nums[i];
//                    nums[i] = iTmp;
//                }
//            }
//        }
        
        // solution 2
        int start_fill_zero_index = 0;
        for (int i = 0; i < iLength; i++) {
            if (nums[i] != 0) {
                nums[start_fill_zero_index++] = nums[i];
            }
        }
        
        for (int i = start_fill_zero_index; i < iLength; i++) {
            nums[i] = 0;
        }
        
        
    }

}
