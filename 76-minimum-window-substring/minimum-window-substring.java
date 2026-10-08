class Solution {
    public String minWindow(String s, String t) {
       Map<Character, Integer> need = new HashMap<>(), window = new HashMap<>();
       for(char c : t.toCharArray())
       {
         need.put(c, need.getOrDefault(c, 0)+1);
       } 
         int have = 0, needCount = need.size(), left = 0;
         int minLen = Integer.MAX_VALUE, start = 0;

         for(int right = 0; right < s.length(); right++)
         {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0)+ 1);
            if(need.containsKey(c) && window.get(c).equals(need.get(c)))
            {
                have++;
            }
            while(have == needCount)
            {
                if(right-left+1 < minLen)
                {
                    minLen = right - left + 1;
                    start = left;
                }
                char d = s.charAt(left++);
                window.put(d, window.get(d) - 1);
                if(need.containsKey(d) && window.get(d) < need.get(d))
                {
                    have--;
                }
            }
         }
         return minLen == Integer.MAX_VALUE ? "" :s .substring(start, start + minLen);
    }
    
}