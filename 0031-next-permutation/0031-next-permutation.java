class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // Find the gola_index
        int gola_index = -1;

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                gola_index = i - 1;
                break;
            }
        }

        // If a gola_index was found
        if (gola_index != -1) {
            int swap_index = gola_index;

            // Find the smallest value greater than nums[gola_index]
            for (int j = n - 1; j > gola_index; j--) {
                if (nums[j] > nums[gola_index]) {
                    swap_index = j;
                    break;
                }
            }

            // Swap
            int temp = nums[gola_index];
            nums[gola_index] = nums[swap_index];
            nums[swap_index] = temp;
        }

        // Reverse the suffix
        reverse(nums, gola_index + 1, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
