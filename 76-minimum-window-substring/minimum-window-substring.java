class Solution {
    public String minWindow(String s, String t) {
      int sLen = s.length(), tLen = t.length();
        if (sLen < tLen) return "";

        int[] counts = new int[128];
        for (int i = 0; i < tLen; i++) {
            counts[t.charAt(i)]++;
        }

        int left = 0, start = 0, minLen = Integer.MAX_VALUE, required = tLen;

        for (int right = 0; right < sLen; right++) {
            if (counts[s.charAt(right)]-- > 0) {
                required--;
            }

            while (required == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                if (counts[s.charAt(left++)]++ == 0) {
                    required++;
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
    
}