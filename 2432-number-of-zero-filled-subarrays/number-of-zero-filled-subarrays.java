class Solution {
    public long zeroFilledSubarray(int[] nums) {
        // long totalSubarrays = 0;
        // long currentStreak = 0;
        
        // for (int num : nums) {
        //     if (num == 0) {
        //         currentStreak++;
        //         // Each consecutive zero adds exactly 'currentStreak' new subarrays
        //         totalSubarrays += currentStreak; 
        //     } else {
        //         // Reset the streak when a non-zero number is found
        //         currentStreak = 0; 
        //     }
        // }
        
        // return totalSubarrays;

        long totalSubarrays = 0;
        long streak = 0;
        
        for (int num : nums) {
            if (num == 0) {
                streak++;
            } else {
                // Streak ended: calculate subarrays for this group and reset
                totalSubarrays += streak * (streak + 1) / 2;
                streak = 0;
            }
        }
        
        // Post-loop check: add the last streak if the array ended with a 0
        totalSubarrays += streak * (streak + 1) / 2;
        
        return totalSubarrays;
    }
}