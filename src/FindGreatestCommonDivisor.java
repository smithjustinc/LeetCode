/*
 * Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 */
public class FindGreatestCommonDivisor {
    public static int findGCD(int[] nums) {
        int min = nums[0];
        int max = 0;
        //get min and max values
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        //return min if it is equal to max or max can be divided by min
        if (min == max || max%min == 0) return min;
        //Find the common divisor by starting with half the value of min
        int divisor;
        if (min%2 == 0) {
            divisor = min/2;
        } else {
            divisor = (min - 1) / 2;
        }
        while (divisor > 0) {
            if (min%divisor == 0 && max%divisor == 0) {
                return divisor;
            }
            divisor --;
        }
        return divisor;
    }

    public static void main(String[] args) {
        int[] x = new int[]{2, 3, 1};
        System.out.println(findGCD(x));
    }
}
