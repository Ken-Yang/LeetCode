package net.kenyang.leetcode;

import java.util.HashMap;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.</br>
 * </br>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 * 
 * @author Ken Yang
 *
 */
public class ClimbingStairs {
    
    // solution 1: recursive with DP
    public class Solution1 {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        public int climbStairs(int n) {
            if (hashmap.containsKey(n)) {
                return hashmap.get(n);
            }

            if (n <= 2) {
                return n;
            }

            int val = climbStairs(n - 1) + climbStairs(n - 2);
            hashmap.put(n, val);
            return hashmap.get(n);
        }
    }
    
    // solution 2: iterative with DP
    public class Solution2 {
        public int climbStairs(int n) {
            int []dp = new int[n+1];
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }
            
            return dp[n];
            
        }
    }

    public ClimbingStairs() {
        System.out.println(new Solution1().climbStairs(44));
        System.out.println(new Solution2().climbStairs(44));
    }

    public static void main(String[] args) {
        new ClimbingStairs();
    }

    
}
