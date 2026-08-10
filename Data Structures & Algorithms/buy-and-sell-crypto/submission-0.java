class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int min = prices[0];
        int maximum = 0;
        for(int right = 0; right<prices.length; right++){
            if(prices[right]<min){
                min = prices[right];
            }
            maximum = Math.max(maximum, prices[right]-min);
        }
        return maximum;
    }
}
