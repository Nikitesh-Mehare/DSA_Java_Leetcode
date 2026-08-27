class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
       // String vowels = "AEIOUaeiou";
        int start = 0, end = chars.length-1;
        while(start < end)
        {
            while(start < end && !isVowels(chars[start]))
            {
                start++;
            }
            while(start < end && !isVowels(chars[end]))
            {
               end--;
            } 
            if(start < end)
            {
                char ch = chars[start];
                chars[start] = chars[end];
                chars[end] = ch;
                start++;
                end--;
            }
        }
        return new String(chars);
    }
    private boolean isVowels(char c)
    {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' ||
        c == 'E' || c == 'I' || c == 'O' || c == 'U')
        {
            return true;
        }
        return false;
    }
}