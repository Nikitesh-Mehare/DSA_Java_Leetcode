class Solution {
    public String reverseWords(String s) {

        String[] str = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i=str.length-1; i>=0; i--)
        {
            ans.append(str[i]);
            if(i>0)
            {
                ans.append(" ");
            }
        }
        return ans.toString();
        // if(s.equals(null) || s.equals(""))
        // {
        //     return s;
        // }
        // String res = "";
        // int i = 0;
        // while(i < s.length())
        // {
        //     while(i < s.length() && s.charAt(i) == ' ')
        //     {
        //         i++;
        //     }
        //     String w = "";
        //     while(i < s.length() && s.charAt(i) != ' ')
        //     {
        //         w += s.charAt(i);
        //         i++;
        //     }
        //     if(!w.equals(""))
        //     {
        //         res = w + " "+ res;
        //     }
        // }
        // if(res.isEmpty())
        // {
        //     return "";
        // }
        // return res.substring(0, res.length() - 1);


        // if (s == null || s.length() == 0) {
        //     return "";
        // }

        // StringBuilder result = new StringBuilder();
        // int i = s.length() - 1;

        // while (i >= 0) {

        //     // Skip spaces
        //     while (i >= 0 && s.charAt(i) == ' ') {
        //         i--;
        //     }

        //     if (i < 0) break;

        //     int j = i;

        //     // Find start of the word
        //     while (i >= 0 && s.charAt(i) != ' ') {
        //         i--;
        //     }

        //     // Append word
        //     result.append(s.substring(i + 1, j + 1)).append(" ");
        // }

        // // Remove trailing space
        // return result.toString().trim();
    }
}