class Solution {
    public int maxProductDifference(int[] nums) {
        int biggest = Integer.MIN_VALUE, secondBiggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for(int num : nums)
        {
            if(num > biggest)
            {
                secondBiggest = biggest;
                biggest = num; 
            }
            else if(secondBiggest < num)
            {
                secondBiggest = num;
            }

            if(num < smallest)
            {
                secondSmallest = smallest;
                smallest = num;
            }
            else if(secondSmallest > num)
            {
                secondSmallest = num;
            }
        }
        return (biggest * secondBiggest) - (smallest * secondSmallest);
    }
}