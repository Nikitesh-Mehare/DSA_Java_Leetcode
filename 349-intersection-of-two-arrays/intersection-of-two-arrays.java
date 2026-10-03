class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num1 :nums1)
        {
            for(int num2 : nums2)
            {
                if(num1 == num2)
                {
                    set.add(num1);
                }
            }
        }
        int[] result = new int[set.size()];
        int i=0; 
        for(int num : set)
        {
            result[i++] = num;
        }
        return result;

    }
}