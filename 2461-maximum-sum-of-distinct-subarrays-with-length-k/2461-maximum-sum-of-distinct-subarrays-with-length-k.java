class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int size = nums.length;
        int i = 0;
        int j = 0;

        long windowSum = 0;
        long maxSum = 0;

        HashSet<Integer> set = new HashSet<>();
        while (j < size) {

            while (set.contains(nums[j])) {
                set.remove(nums[i]);
                windowSum -= nums[i];
                i++;
            }

            set.add(nums[j]);
            windowSum += nums[j];

            if (j - i + 1 < k) {
                j++;
            }
            else if (j - i + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
                set.remove(nums[i]);
                windowSum -= nums[i];
                i++;
                j++;
            }
        }
        return maxSum;
    }
}