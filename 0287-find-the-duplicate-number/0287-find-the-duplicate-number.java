class Solution {
    public int findDuplicate(int[] nums) {
        // Start both pointers at the first value
        int slow = nums[0];
        int fast = nums[0];

        // Move once before entering the while loop
        slow = nums[slow];
        fast = nums[nums[fast]];

        // Phase 1: Find a meeting point inside the cycle
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        // Phase 2: Find the entrance of the cycle
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna