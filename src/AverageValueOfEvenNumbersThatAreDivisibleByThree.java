/*
 * Given an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.
 * Note that the average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.
 */

public class AverageValueOfEvenNumbersThatAreDivisibleByThree {

    public static int averageValue(int[] nums) {
        int sum = 0;
        int counter= 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0 && nums[i]%3==0) {
                sum += nums[i];
                counter++;
            }
        }
    if (sum == 0) return 0;
    sum = sum - (sum%counter);
    return sum/counter;
    }

    public static void main(String[] args) {
        int[] x = new int[]{1, 2, 3, 4, 5, 6, 9};
        System.out.println(averageValue(x));
    }
}
