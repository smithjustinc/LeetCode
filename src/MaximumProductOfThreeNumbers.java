/*
 * Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
 */

 import java.util.Arrays;

public class MaximumProductOfThreeNumbers {

    public static int maximumProduct (int[] nums) {
        if (nums.length == 3) {
            return (nums[0] * nums[1] * nums[2]);
        } 
        Arrays.sort(nums);
        //The following checks if the product of the two smallest integers with the largest integer is larger
        //than the product of the three largest integers. This must be checked because negative integers are included in use cases.
        if ((nums[0]*nums[1]*nums[nums.length-1]) > (nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3])){
            return (nums[0] * nums[1] * nums[nums.length-1]);
        }else {
            return (nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3]);
        }
    }
    
    public static void main(String[] args) {
        int[] test = new int[]{2, 5, 3, 9, 54, 23, 2};
        System.out.println(maximumProduct(test));
    }
}
