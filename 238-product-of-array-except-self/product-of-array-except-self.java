public class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) 
        {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) 
        {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
        
        
        
    
        
        // int n = nums.length;
        // int[] answer = new int[n];

        // // Step 1: Calculate prefix products
        // int prefix = 1;
        // for (int i = 0; i < n; i++) {
        //     answer[i] = prefix;
        //     prefix *= nums[i];
        // }

        // // Step 2: Calculate suffix products and multiply with prefix
        // int suffix = 1;
        // for (int i = n - 1; i >= 0; i--) {
        //     answer[i] *=  suffix;
        //     suffix *= nums[i];
        // }

        // return answer;
    }
}
