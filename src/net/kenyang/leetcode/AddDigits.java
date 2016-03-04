package net.kenyang.leetcode;


/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * </br></br>
 * For example:
 * </br></br>
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * @author Ken Yang
 *
 */
public class AddDigits {

    public AddDigits() {
        System.out.println(addDigits(38));
    }

    public static void main(String[] args) {
        new AddDigits();
    }

    public int addDigits(int num) {
        
        return ((num-1) % 9) + 1;
        
//        while(num / 2 >= 5) {
//            final String strNum = String.valueOf(num);
//            num = 0;
//            for (char c: strNum.toCharArray()){
//                num +=  Character.getNumericValue(c);
//            }
//        }
//        
//        
//        return num;
    }

}
