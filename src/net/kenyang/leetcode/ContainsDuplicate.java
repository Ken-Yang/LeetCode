package net.kenyang.leetcode;

import java.util.HashMap;
import java.util.HashSet;

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
