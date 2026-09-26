class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long totalSubarrays = 0;
        long currentStreak = 0;
        
        for (int num : nums) {
            if (num == 0) {
                currentStreak++;
                // Each consecutive zero adds exactly 'currentStreak' new subarrays
                totalSubarrays += currentStreak; 
            } else {
                // Reset the streak when a non-zero number is found
                currentStreak = 0; 
            }
        }
        
        return totalSubarrays;
    }
}