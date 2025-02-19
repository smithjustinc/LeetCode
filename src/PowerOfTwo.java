/*
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 * An integer n is a power of two, if there exists an integer x such that n == 2x.
 */
public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n > 1073741824) return false;
        int y = 2;
        if (n <= 1024) {
            while ( n > y) {
                y = 2*y;
            }
        }else if (n <= 104876) {
            while ( n > y) {
                y = 2*y;
            }
        }else if (n <= 1073741824) {
            while ( n > y) {
                y = 2*y;
            }
        }else {
            while ( n > y) {
                y = 2*y;
            }
        }
        if (n != y) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(6));
    }
}
