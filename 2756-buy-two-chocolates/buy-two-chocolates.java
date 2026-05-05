class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int moneyleft=money;
        int sum=prices[0]+prices[1];
        if(moneyleft-sum>=0)
        {
            return moneyleft-sum;
        }
        else 
        {
            return money;
        }
        
        
    }
}