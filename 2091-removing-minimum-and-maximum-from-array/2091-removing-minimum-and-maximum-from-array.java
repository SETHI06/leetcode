class Solution {
    public int minimumDeletions(int[] nums) {
        int minIdx = 0, maxIdx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[minIdx]>nums[i]) minIdx = i;
            if(nums[maxIdx]<nums[i]) maxIdx = i;
        }

        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);

        int fromLeft = right + 1;
        int fromRight = nums.length - left;
        int fromBoth = (left + 1) + (nums.length - right);

        return Math.min(fromLeft, Math.min(fromRight, fromBoth));
    }
}