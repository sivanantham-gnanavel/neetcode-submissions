class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1, len = prices.length, max = 0; 
        while ( left < len && right < len ) {
            if ( prices[left] >= prices[right]) {
                left = right;
                right++;
            } else {
                max = Math.max(max, prices[right] - prices[left]);
                right++;
            }
        }
        return max;
    }
}
