class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        for(int i=0;i<fruits.length;i++)
        {
            for(int j=0;j<baskets.length;j++)
            {
                if(fruits[i]<=baskets[j])
                {
                    baskets[j]=0;
                    count++;
                    break;

                }
            }
        }
        if(count==baskets.length)
        {
            return 0;
        }
        else 
        {
           return  baskets.length-count;
        }
        
    }
}