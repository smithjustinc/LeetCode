/*
 * Write an algorithm to determine if a number n is happy.
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 */
import java.util.*;

public class HappyNumber {
    // Function to get the digits of a number
    public static List<Integer> getDigits(int n) {
        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            int temp = n % 10;
            if ( temp == 0) {
                n = n/10;
            }else {
                digits.add(temp);
                n = (n-temp) / 10;
            }
        }
        return digits;
    }
    // Function to check if a number is happy
    public static boolean isHappy(int n) {
        int counter = 0;
        try {
            while (n != 1 && counter < 10) {
                List<Integer> digits = new ArrayList<>();
                digits = getDigits(n);
                n = 0;
                for (int digit : digits) {
                    n += digit*digit;
                }
                counter++;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println(isHappy(19));
    }
}
