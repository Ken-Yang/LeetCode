package net.kenyang.leetcode;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        new ExcelSheetColumnNumber();
    }

    public ExcelSheetColumnNumber() {
        System.out.println(titleToNumber("AB"));
    }

    public int titleToNumber(String s) {

        int iLength = s.length();
        int res = 0;
        for (int i = 0; i < iLength; i++) {
            /*
             * previous digit = (res * 26) = (1 * 26) = ('A' * 26) 
             * current digit = s.charAt(i) - 'A' + 1 = 'B' - 'A' +1 = 66 - 65 + 1 = 1 
             */
            res = (res * 26) + s.charAt(i) - 'A' + 1;
        }

        return res;
    }

}
