class Solution {
    public int maximumWealth(int[][] accounts) {
        int rows = accounts.length;
        int cols = accounts[0].length;
        int maxWealth = 0;
        for(int i=0;i<rows;i++)    //row
        {
            int wealth = 0;
            for(int j=0;j<cols;j++)   //col
            {
                wealth = wealth + accounts[i][j]; 
            }    
            maxWealth = Math.max(wealth, maxWealth);
        }
        return maxWealth;
    }
}