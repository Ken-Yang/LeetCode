package net.kenyang.leetcode;

import java.util.Arrays;

/**
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than ⌊ n/2 ⌋ times.</br>
 * </br>
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * 
 * @author Ken Yang
 *
 */
public class MajorityElement {

    public MajorityElement() {
        System.out.println(majorityElement(new int[] { 3, 2, 3 }));

    }

    public static void main(String[] args) {
        new MajorityElement();
    }

    public int majorityElement(int[] nums) {

        // solution 2
        int count = 0;
        int length = nums.length;
        int majority = 0;
        for (int i = 0; i < length; i++) {
            if (count == 0) {
                majority = nums[i];
                count = 1;
            } else if (majority == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return majority;

        // solution 1
        // Arrays.sort(nums);
        // int ret = nums[0];
        // int count = 1;
        // int length = nums.length;
        // for (int i = 1; i < length; i++) {
        // if (ret == nums[i]) {
        // count++;
        // if (count > (length / 2))
        // return ret;
        // } else {
        // count = 1;
        // ret = nums[i];
        // }
        // }
        // return ret;
    }

}
