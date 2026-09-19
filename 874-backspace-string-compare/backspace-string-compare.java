class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        // if(s.length() != t.length())
        // {
        //     return false;
        // }

        for(char ch : s.toCharArray())
        {
            if(ch != '#')
            {
                s1.push(ch);
            }
            else if(!s1.isEmpty())
            {
                s1.pop();
            } 
        }
        for(char ch : t.toCharArray())
        {
             if(ch != '#')
            {
                s2.push(ch);
            }
            else if(!s2.isEmpty())
            {
                s2.pop();
            } 
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while(!s1.isEmpty())
        {
            sb1.append(s1.pop());
        }
        while(!s2.isEmpty())
        {
            sb2.append(s2.pop());
        }
        String str1 = sb1.reverse().toString();
        String str2 = sb2.reverse().toString();
        
        return str1.equals(str2);
    }
}