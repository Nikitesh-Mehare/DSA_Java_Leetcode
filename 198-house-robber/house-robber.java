class Solution {
    public int rob(int[] nums) {
        // Base case: if there are no houses, no money can be stolen
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int robPrevious = 0; // Max money if the immediate previous house was robbed
        int robBeforePrevious = 0; // Max money if the house before that was robbed
        
        for (int currentHouseMoney : nums) {
            // Option 1: Rob the current house + max money from two houses ago
            // Option 2: Skip the current house and keep the max money from the previous house
            int currentMax = Math.max(robBeforePrevious + currentHouseMoney, robPrevious);
            
            // Move our pointers forward for the next iteration
            robBeforePrevious = robPrevious;
            robPrevious = currentMax;
        }
        
        return robPrevious;
    }
}