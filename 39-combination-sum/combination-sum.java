class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
     private void backtrack(int[] candidates, int remain, int start, List<Integer> tempList, List<List<Integer>> result) {
        if (remain < 0) {
            return; // Target exceeded, stop this branch
        } else if (remain == 0) {
            result.add(new ArrayList<>(tempList)); // Valid combination found
        } else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                // Not 'i + 1' because we can reuse the same element
                backtrack(candidates, remain - candidates[i], i, tempList, result); 
                tempList.remove(tempList.size() - 1); // Backtrack
            }
        }
    }
}