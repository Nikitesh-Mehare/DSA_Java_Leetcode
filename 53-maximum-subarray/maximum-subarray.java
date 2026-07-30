class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int sum = 0;
        for(int i=0; i<=nums.length-1; i++)
        {
            if(sum >= 0)
            {
                sum = sum + nums[i];
            }
            else{
                sum = nums[i];
            }
                maxsum = Math.max(sum, maxsum);
            
        }
        return maxsum;
    }
}