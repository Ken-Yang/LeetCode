package net.kenyang.leetcode;

import java.util.Arrays;
import java.util.HashMap;


public class ValidAnagram {

    public ValidAnagram() {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static void main(String[] args) {
        new ValidAnagram();
    }

    public boolean isAnagram(String s, String t) {
        // Solution 1: using sort
        char[] szS = s.toCharArray();
        char[] szT = t.toCharArray();
        
        Arrays.sort(szT);
        Arrays.sort(szS);
        System.out.println(szS);
        System.out.println(szT);
        s = new String(szS);
        t = new String(szT);
        
        return s.equals(t);
        
        // Solution 2: using hashmap
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        HashMap<String, Integer> count = new HashMap<>();
//
//        for (char c : s.toCharArray()) {
//            final String tmpKey = String.valueOf(c);
//            int iCount = 1;
//            if (count.get(tmpKey) != null) {
//                iCount = count.get(tmpKey) + 1;
//            }
//            count.put(tmpKey, iCount);
//        }
//
//        for (char c : t.toCharArray()) {
//            final String KEY = String.valueOf(c);
//            if (count.get(KEY) != null) {
//                final int COUNT = count.get(KEY) - 1;
//                if (COUNT < 0) {
//                    return false;
//                } else {
//                    count.put(KEY, COUNT);
//                }
//            } else {
//                return false;
//            }
//        }
//
//        return true;
    }
}
