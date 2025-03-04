/*
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
 * An integer n is a power of four, if there exists an integer x such that n == 4^x.
 */

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if (n == 0) return false;
        while (n % 4 == 0) {
            n = n/4;
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
}
