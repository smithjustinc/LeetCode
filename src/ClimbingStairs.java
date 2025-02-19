public class ClimbingStairs {

    /*
     * You are climbing a staircase. It takes n steps to reach the top.
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     * Constraints: 1 <= n <= 45
     * 
     * Expected Results:
     * 1 = 1
     * 2 = 2
     * 3 = 3
     * 4 = 5
     * 5 = 8
     * 6 = 13
     * 7 = 21
     * 8 = 34
     * 9 = 55
     * 10 = 89
     ________________________________________________________________________________________________________________________________
    * This is a recursive solution following a fibonnaci sequence recursive approach. This method is not efficient for larger inputs.
    * Time complexity: O(2^n)
    * Space complexity: O(n)
    public static int climbStairs(int n) {
        if (n < 4) {
            return n;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
    ________________________________________________________________________________________________________________________________
    * The following uses fast doubling to compute Fibonacci numbers by halving the input n and using 
    * doubling formulas to calculate pairs of Fibonacci numbers.
    * This method avoids redundant calculations and is more efficient.
    * Time complexity: O(log n)
    * Space complexity: O(1)
    */
    private static int[] fibFastDoublingHelper(int n) {
        if (n == 0) {
            return new int[] {0, 1};
        }
        int[] pair = fibFastDoublingHelper(n/2);
        int a = pair[0];
        int b = pair[1];

        int c = a * (2 * b - a);
        int d = a * a + b * b;

        if (n % 2 == 0) {
            return new int[]{c, d};
        } else {
            return new int[]{d, c + d};
        }
    }

    public static int climbStairs(int n) {
        
        return fibFastDoublingHelper(n+1)[0];
    }

    //test values 1 to 10
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 11; i++) {
            System.out.println(climbStairs(i));
        }
    }
}

