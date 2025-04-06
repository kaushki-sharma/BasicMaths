class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i=nums.length-1;
        int res=(nums[i-1]-1)*(nums[i]-1);
        return res;

        
    }
}