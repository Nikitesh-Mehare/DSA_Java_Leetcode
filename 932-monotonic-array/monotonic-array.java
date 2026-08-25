class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;
        int n = nums.length;

        for(int i=0; i<=n-2; i++)
        {
            if(nums[i] < nums[i+1])
            {
                dec = false;
            }
        }
        for(int i=0; i<=n-2; i++)
        {
            if(nums[i] > nums[i+1])
            {
                inc = false;
            }
        }
        if(inc == true || dec == true)
        {
            return true;
        }
        return false;
    }
}