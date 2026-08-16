class Solution {
    public int maxArea(int[] height) {

        int l = 0, r = height.length - 1, max = 0;

        while (l < r) 
        {
           max = Math.max(max, (r - l) * Math.min(height[l], height[r]));
           if (height[l] < height[r]) l++;
           else r--;
        }
        return max;

        // int left =0;
        // int right = height.length-1;
        // int maxArea = 0, currentArea = 0;
        // while(left < right)
        // {
        //     currentArea = (int)(Math.min(height[left], height[right])*(right - left));
        //     maxArea = Math.max(currentArea, maxArea);
        //     if(height[left] <= height[right])
        //     {
        //         left++;
        //     }
        //     else if(height[left] > height[right])
        //     {
        //         right--;
        //     }
        // }
        // return maxArea;
    }
}