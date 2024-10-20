class Solution {
    public int[] getConcatenation(int[] nums) {
        int s=nums.length;
        int [] numt= new int [2*s];
        for(int i=0;i<(2*s);i++)
        {
            numt[i]=nums[i%s];

        }

        return numt;

        
    }
}