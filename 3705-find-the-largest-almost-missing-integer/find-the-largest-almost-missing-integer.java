class Solution {
    public int largestInteger(int[] nums, int k) {
        int ans = -1;
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //if k == 1
        if(k == 1)
        {
            for(int num : map.keySet())
            {
                if(map.get(num) == 1)
                {
                    ans = Math.max(ans, num);
                }
            }
            return ans;
        }
        //if k == whole array length
        if(k == nums.length)
        {
            int maxVal = Integer.MIN_VALUE;
            for(int num : nums)
            {
                maxVal = Math.max(maxVal, num);
            }
            return maxVal;
        }
        //if 1 < k <nums.length
        if(1 < k && k < nums.length)
        {
            if(map.get(nums[0]) == 1)
            {
                ans = Math.max(ans, nums[0]);
            }
            if(map.get(nums[nums.length - 1]) == 1)
            {
                ans = Math.max(ans, nums[nums.length - 1]);
            }
            return ans;
        }
        return ans;
    }
}