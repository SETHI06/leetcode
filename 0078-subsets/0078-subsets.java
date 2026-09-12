class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        allSubsets(0, nums, current, result);

        return result;
    }

    public void allSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {

        // add current subset
        result.add(new ArrayList<>(current));

        // take every next element
        for (int i = index; i < nums.length; i++) {

            current.add(nums[i]);

            // recursion
            allSubsets(i + 1, nums, current, result);

            // backtrack
            current.remove(current.size() - 1);
        }
    }
}