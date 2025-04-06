class Solution {
    public int maxProduct(int[] nums) {
        int maxi=0;
        int secondmaxi=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>maxi)
            {
                secondmaxi=maxi;
                maxi=nums[i];
            }
            else
            {
                secondmaxi=Math.max(secondmaxi,nums[i]);
            }

        }


        int res=(maxi-1)*(secondmaxi-1);
        return res;

        
    }
}