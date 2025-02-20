/*
 * Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
 * An integer m is a divisor of n if there exists an integer k such that n = k * m.
 */

 /*
  * Solution approach:
  * If a number has three divisors it will be 1, the number, and the square root of the number.
  * First check if the number has a square root that is a whole number, if not return false.
  * Then check if the number is even and not 4, if it is return false.
  * Check if the number is 1, if it is return false.
  * Within a loop, ensure there are no divisors between 1 and the square root of the number.
  */
public class ThreeDivisors {
    public static boolean isThree(int n) {
        //Get square root
        double x = (double) Math.sqrt(n);
        //Return false if the number is even and not 4, if the number is 1, or if the square root is not a whole number.
        if (n%2 == 0 && n!= 4 || n == 1 || x % 1 != 0) return false;
        //Update x to be 2 less
        x = x-2;
        //Check that there are no other divisors between 1 and the square root of the number.
        while (x > 1) {
            if (n % x == 0) return false;
            x = x - 2;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isThree(1));
    }
}
