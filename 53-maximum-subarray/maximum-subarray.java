class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0], currSum = nums[0];     
        for (int i = 1; i < nums.length; i++) 
        {         
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);     
        }     
        return maxSum;

        // int maxsum = nums[0];
        // int sum = 0;
        // for(int i=0; i<=nums.length-1; i++)
        // {
        //     if(sum >= 0)
        //     {
        //         sum = sum + nums[i];
        //     }
        //     else{
        //         sum = nums[i];
        //     }
        //         maxsum = Math.max(sum, maxsum);
            
        // }
        // return maxsum;
    }
}