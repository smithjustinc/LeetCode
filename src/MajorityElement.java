/*
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 */
import java.util.Arrays;
// Only need the below import for HashMap Method
// import java.util.*;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        //Sort Method
        Arrays.sort(nums);
        return nums[(nums.length/2)];

        //HashMap Method
        /*
        Map<Integer, Integer> hashCount = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashCount.put(nums[i], hashCount.getOrDefault(nums[i], 0) + 1);
        }
        int maxFreq = 0;
        int majorityElement = nums[0];
        for (Map.Entry<Integer, Integer> num : hashCount.entrySet()) {
            if (num.getValue() > maxFreq) {
                maxFreq = num.getValue();
                majorityElement = num.getKey();
            }
            System.out.println(num.getKey() + " " + num.getValue());
        }
        return majorityElement;
        */
    }


    public static void main(String[] args) throws Exception {
        int[] x = new int[]{3, 2, 3};
        System.out.println(majorityElement(x));
    }
}
