class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;

       while(i>0)
       {
        if(nums[i]==nums[i-1])
        {
            return true;
            
        }
        i--;
       }
        return false;
        
    }
}