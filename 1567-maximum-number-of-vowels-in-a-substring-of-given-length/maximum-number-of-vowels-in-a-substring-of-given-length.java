class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a','e','i','o','u');
        int count = 0;
        for(int i=0; i<k; i++)
        {
            if(vowels.contains(s.charAt(i)))
            {
                count++;
            }
        }
        int maxCount = count;
        for(int i=k; i<s.length(); i++)
        {
            count += vowels.contains(s.charAt(i)) ? 1 : 0;
            count -= vowels.contains(s.charAt(i-k)) ? 1 : 0;
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;

    }
}