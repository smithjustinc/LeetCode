/*
 * Given an integer array nums and an integer k, return true if there are two distinct indices
 * i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 */

 import java.util.HashMap;

public class ContainsDuplicateII {

    //Method to test if the absolute difference between i and j is less than or equal to k
    public static boolean kFunction(int i, int j, int k) {
        if (Math.abs(i-j) <= k) {
            return true;
        } else {
            return false;
        }
    }
    //Method to check if there are duplicates in the array. The duplicate is then tested with the kFunction
    public static boolean containsDuplicateII(int[] nums, int k) {
        HashMap<Integer, Integer> storedValues = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (storedValues.containsKey(nums[i])) {
                if (kFunction(storedValues.get(nums[i]), i, k)) {
                    return true;
                }else {
                    storedValues.put(nums[i], i);
                }
            }else {
                storedValues.put(nums[i], i);
            }
        }
        return false;
    }

    // Test
    public static void main(String[] args) throws Exception {
        int[] myArray = new int[]{1,2,3,1,2,3};
        System.out.println(containsDuplicateII(myArray, 2));
    }
}
