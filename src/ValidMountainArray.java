/*
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * Recall that arr is a mountain array if and only if:
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 */

public class ValidMountainArray {
    //iterate through the array until a decrease in numbers occurs.
    //switch to the inner loop to continue the iteration but with the condition of the numbers decreasing
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) return false;
            if (arr[i] > arr[i+1]) {
                if (i == 0) return false;
                for (int j = i; j < arr.length-1; j ++) {
                    if (arr[j] > arr[j+1]) continue;
                    else return false;
                }
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] x = new int[] {1, 2, 3, 2, 2};
        System.out.println(validMountainArray(x));
    }
}
