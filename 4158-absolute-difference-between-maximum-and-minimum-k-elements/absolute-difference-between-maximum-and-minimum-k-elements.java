class Solution {
    public int absDifference(int[] nums, int k) {

    Arrays.sort(nums);
    int suml=0;
    int sums=0;
    int i=0;
    int j=nums.length-1;
   for (int o=0;o<k;o++)
    {
         suml=nums[j]+suml;
         sums=nums[i]+sums;
        i++;
        j--;
    

    }
    return Math.abs(suml-sums);
        
    }
}