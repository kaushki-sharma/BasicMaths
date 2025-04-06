class Solution {
    public int maxProductDifference(int[] nums) {
       int max1=Integer.MIN_VALUE;
       int max2=Integer.MIN_VALUE;
       int min1=Integer.MAX_VALUE;
       int min2=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>max1)
        {
            max2=max1;
            max1=nums[i];

        }else
        {
            max2=Math.max(max2,nums[i]);
        }
        if(nums[i]<min1)
        {
           min2=min1;
           min1=nums[i];
        }
        else 
        {
            min2=Math.min(min2,nums[i]);
        }
       }

       return ((max1*max2)-(min1*min2));
        
    }
}