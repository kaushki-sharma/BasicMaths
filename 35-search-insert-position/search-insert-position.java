class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int ans=nums.length;
        int j=nums.length-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(nums[mid]>=target)
            {
              ans=mid;
              j=mid-1;
            }
            
            else if(nums[mid]<target)
            {
        
                i=mid+1;;
            }
            
            
    
        }
        return ans;
        
    }
}