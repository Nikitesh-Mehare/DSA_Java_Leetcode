class Solution {
    public int[] singleNumber(int[] nums) {
    long xorAll = 0;
    for (int num : nums) {
        xorAll ^= num;
    }
    
    long mask = xorAll & -xorAll;
    
    int firstUnique = 0;
    int secondUnique = 0;
    
    for (int num : nums) {
        // In Java, bitwise results must be explicitly evaluated as a boolean
        if ((num & mask) != 0) {
            firstUnique ^= num;
        } else {
            secondUnique ^= num;
        }
    }
    return new int[] {firstUnique, secondUnique};
    }
}