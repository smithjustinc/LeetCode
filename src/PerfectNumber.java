/*
 * A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. 
 * A divisor of an integer x is an integer that can divide x evenly.
 * Given an integer n, return true if n is a perfect number, otherwise return false.
 */

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
    //Function that goes through values 1 to half the 
    //value of the input to store & return divisors
    public static List<Integer> getDivisors(int num) {
        List<Integer> result = new ArrayList<>();
        int low = 1;
        int high = 0;
        if (num % 2 == 0) {
            high = num/2;
        }else {
            high = (num-1) / 2;
        }
        while (low <= high) {
            if (num%low ==0) {
                result.add(low);
            }
            low++;
        }
        return result;
    }
    //Calls getDivisors, obtains the sum of the divisors,
    //checks if sum is equal to the input
    public static boolean checkPerfectNumber(int num) {
        List<Integer> divisors = getDivisors(num);
        int sum = 0;
        for (int divisor : divisors) {
            sum = sum + divisor;
            System.out.println(divisor);
        }
        if (sum == num) return true;
        return false;
    }
    public static void main(String[] ars) {
        System.out.println(checkPerfectNumber(28));
    }
}
