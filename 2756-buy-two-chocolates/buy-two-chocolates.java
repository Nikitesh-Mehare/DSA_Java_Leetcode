class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for (int price : prices) {
            if (price < min1) {
                min2 = min1; // Old smallest becomes second smallest
                min1 = price; // Update smallest
            } else if (price < min2) {
                min2 = price; // Update second smallest
            }
        }
        
        int minCost = min1 + min2;
        return money >= minCost ? money - minCost : money;
    }
}