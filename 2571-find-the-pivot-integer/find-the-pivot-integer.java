class Solution {
    public int pivotInteger(int n) {

        int sum=(n*(n+1))/2;
        int ans=(int)Math.sqrt(sum);
        if(ans*ans==sum)
        {
        return ans;
        }
        else
        {
            return -1;
        }
        
    }
}