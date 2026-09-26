class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;

        // Calculate the sum of the first window.
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Slide the window from left to right.
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }
}
