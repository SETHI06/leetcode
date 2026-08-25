class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);

        int multiple = 1;
        for (int num : nums){
            if (k * multiple == num){
                multiple++;
            }
        }
        return k * multiple;
    }
}