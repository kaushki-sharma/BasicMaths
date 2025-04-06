class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int res1=nums[i]*nums[i+1];
        int res2=nums[nums.length-1]*nums[nums.length-2];
        return res2-res1;
        
    }
}