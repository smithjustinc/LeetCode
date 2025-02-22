/*
 * Given an integer n, return true if it is a power of three. 
 * Otherwise, return false.
 * An integer n is a power of three, if there exists an integer x
 * such that n == 3^x.
 */

public class PowerofThree {
    public static boolean isPowerOfThree(int n) {
        while (n >= 1) {
            if (n ==1) return true;
            if (n%3 != 0) return false;
            n = n/3;
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(isPowerOfThree(27));
    }
}
