class Solution {
    public int countCommas(int n) {
        return n > 999 ? n - 999 : 0;
        // if(n < 1000)
        // {
        //     return 0;
        // }
        // return n - 1000 + 1;
        // return Math.max(n-1000+1, 0);
    }
}