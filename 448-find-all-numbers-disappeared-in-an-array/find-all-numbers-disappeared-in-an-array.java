class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // 1. Mark present numbers by making the value at their corresponding index negative
        for (int i = 0; i < nums.length; i++) { 
            int indexVal = Math.abs(nums[i]); 
            nums[indexVal - 1] = -Math.abs(nums[indexVal - 1]); 
        } 
        
        List<Integer> ans = new ArrayList<>(); 
        
        // 2. Identify missing numbers by finding remaining positive values
        for (int j = 0; j < nums.length; j++) { 
            if (nums[j] > 0) { 
                ans.add(j + 1); 
            } 
        } 
        return ans;
    }
}