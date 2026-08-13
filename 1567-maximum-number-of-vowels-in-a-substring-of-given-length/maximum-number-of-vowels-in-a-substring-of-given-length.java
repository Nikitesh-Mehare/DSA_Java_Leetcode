class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxCount = 0;
        
        // 1. Process the initial window of size k
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        maxCount = count;
        
        // Early exit optimization
        if (maxCount == k) return k;

        // 2. Slide the window across the remaining characters
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
            if (isVowel(s.charAt(i - k))) {
                count--;
            }
            
            if (count > maxCount) {
                maxCount = count;
                if (maxCount == k) return k; // Early exit if max possible vowels achieved
            }
        }
        
        return maxCount;
    }

    // Helper method replacing Set lookup for O(1) performance and primitive execution
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
