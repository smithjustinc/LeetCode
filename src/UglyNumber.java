/*
 * An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
 * Given an integer n, return true if n is an ugly number.
 */

public class UglyNumber {
    public static boolean isUgly(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        while (n != 5 && n != 3 && n != 2) { 
            if (n % 5 == 0) {
                n = n/5;
            }else if(n % 3 == 0) {
                n = n/3;
            }else if(n % 2== 0) {
                n = n/2;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(1));
    }
}
