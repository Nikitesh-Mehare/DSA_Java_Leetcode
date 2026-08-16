import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Step 1: Sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++; // We need a bigger number
                }
                else {
                    right--; // We need a smaller number
                }
            }
        }

      return result;

        // if(nums.length < 3)
        // {
        //     return new ArrayList<>();

        // }
        // Set<List<Integer>> result = new HashSet<>();
        // Arrays.sort(nums);
        // for(int i = 0; i < nums.length -2; i++)
        // {
        //     int j = i+1;
        //     int k = nums.length - 1;
        //     while(j<k)
        //     {
        //         int sum = nums[i] + nums[j] + nums[k];
        //         List<Integer> list = new ArrayList<>();
        //         if(sum == 0)
        //         {
        //             list.add(nums[i]);
        //             list.add(nums[j]);
        //             list.add(nums[k]);
        //             j++;
        //             k--;
        //             result.add(list);
        //         }
        //         else if(sum > 0)
        //         {
        //             k--;
        //         }
        //         else 
        //         {
        //             j++;
        //         }
        //     }
        // }
        // return new ArrayList<List<Integer>>(result);
    }
}
