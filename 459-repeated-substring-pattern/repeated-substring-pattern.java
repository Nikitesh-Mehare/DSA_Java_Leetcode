class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // Double the string
        String doubled = s + s;
        // Strip the first and last characters, then check if 's' exists inside
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }
}