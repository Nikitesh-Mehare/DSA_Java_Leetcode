class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums2.length; i++){
            set.add(nums2[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            if(set.contains(nums1[i])){
                list.add(nums1[i]);
                set.remove(nums1[i]);
            }
        }

        int ans[] = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }

        return ans;
   
    }
}