class Solution {
    public String mergeAlternately(String word1, String word2) {
        // int len1 = word1.length();
        // int len2 = word2.length();
        // int min = Math.min(len1, len2);
        // String longerString = "";
        // if(min == len1)
        // {
        //     longerString = word2;
        // }
        // if(min == len2)
        // {
        //     longerString = word1;
        // }
        // char ch1[] = word1.toCharArray();
        // char ch2[] = word2.toCharArray();
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0; i < min; i++)
        // {
        //     sb.append(ch1[i]);
        //     sb.append(ch2[i]);
        // }
        // sb.append(longerString.substring(min));
        // return sb.toString();

        int i=0, j=0;
        StringBuilder sb = new StringBuilder();
        while(i < word1.length() || j < word2.length())
        {
            if(i < word1.length())
            {
                sb.append(word1.charAt(i));
            }
            i++;
            if(j < word2.length())
            {
                sb.append(word2.charAt(j));
            }
            j++;
        }
        return sb.toString();
    }
}