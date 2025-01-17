class Solution {
    public int maxProfit(int[] prices) {
         int min = Integer.MAX_VALUE;
        
        // Initialize min to the minimum value an int can hold
        int max = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            max=Math.max(prices[i]-min,max);
        }
        return max;
        
        
    }
}