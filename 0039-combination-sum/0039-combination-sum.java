class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        findCombinations(0, candidates, target, ans, current);

        return ans;
    }
    public void findCombinations(int index, int[] candidates, int target, List<List<Integer>> ans, List<Integer> current){

            if (index == candidates.length){
                if (target == 0){
                    ans.add(new ArrayList<>(current));
                }
                return;
            }

            if (candidates[index] <= target){
                current.add(candidates[index]);

                findCombinations(index, candidates, target-candidates[index], ans, current);

                current.remove(current.size() - 1);
            }
            findCombinations(index + 1, candidates, target, ans, current);
        }
}