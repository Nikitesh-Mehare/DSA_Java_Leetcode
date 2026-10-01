class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");

        if(pattern.length() != word.length)
        {
            return false;
        }

        Map<Object, Integer> map = new HashMap<>();
        for(int i=0; i<word.length; i++)
        {
            Integer a = map.put(pattern.charAt(i), i);
            Integer b = map.put(word[i], i);

            if(!Objects.equals(a, b))
            {
                return false;
            }
        }
        return true;
    }
}