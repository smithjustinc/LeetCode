/*
 * Our hero Teemo is attacking an enemy Ashe with poison attacks! When Teemo attacks Ashe,
 * Ashe gets poisoned for a exactly duration seconds. More formally, an attack at second t will mean Ashe is poisoned
 * during the inclusive time interval [t, t + duration - 1]. If Teemo attacks again before the poison effect ends, 
 * the timer for it is reset, and the poison effect will end duration seconds after the new attack.
 * 
 * You are given a non-decreasing integer array timeSeries, where timeSeries[i] denotes that 
 * Teemo attacks Ashe at second timeSeries[i], and an integer duration.
 * 
 * Return the total number of seconds that Ashe is poisoned.
 */

public class TeemoAttacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        //set totalDuration equal to duration because the final element will always last *duration* seconds
        int totalDuration = duration;
        //Only iterate through to the second to last element, the last element is already calculated
        for (int i = 0; i < timeSeries.length - 1; i ++) {
            if (timeSeries[i+1] - timeSeries[i] < duration) {
                totalDuration += timeSeries[i+1] - timeSeries[i];
            }else {
                totalDuration += duration;
            }
        }
        return totalDuration;
    }
    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 5, 8};
        System.out.println(findPoisonedDuration(test, 2));
    }
}
