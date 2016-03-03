package net.kenyang.leetcode;

public class RemoveElement {

    public static void main(String[] args) {
        new RemoveElement();
    }
    
    public RemoveElement() {
        int []num = new int[3];
        num[0] = 2;
        num[1] = 3;
        num[2] = 3;
        System.out.println(removeElement(num, 3));
    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i : nums) {
            if (i != val) {
                nums[count] = i;
                count ++;
            }
        }
        
        return count;
    }
    
}
