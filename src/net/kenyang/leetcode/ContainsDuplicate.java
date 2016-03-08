package net.kenyang.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * @author Ken Yang
 *
 */
public class ContainsDuplicate {

    public ContainsDuplicate() {
    }

    public static void main(String[] args) {
        new ContainsDuplicate();
    }

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hashset = new HashSet<>();

        for (int i : nums) {
            if (!hashset.add(i)) {
                return true;
            }
        }

        return false;
    }

}
