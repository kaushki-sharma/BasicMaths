class Solution {
    public boolean canAliceWin(int[] nums) {

        int summs=0;
        int sumd=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10)
            {
                summs=summs+nums[i];
            }
            else
            {
                sumd=sumd+nums[i];
            }
        }
        if(sumd==summs)
        {
            return false;
        }
        else 
        {
            return true;
        }
        
    }
}