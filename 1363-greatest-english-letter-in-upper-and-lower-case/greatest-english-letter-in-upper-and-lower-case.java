class Solution {
    public String greatestLetter(String s) {
         Set<Character> chars = new HashSet<>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }
        
        // Loop backwards from 'Z' to 'A'
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            char lower = Character.toLowerCase(ch);
            if (chars.contains(ch) && chars.contains(lower)) {
                return String.valueOf(ch);
            }
        }
        
        return "";
    }
}