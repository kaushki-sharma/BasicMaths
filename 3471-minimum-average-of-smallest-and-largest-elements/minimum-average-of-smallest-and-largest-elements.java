class Solution {
    public double minimumAverage(int[] nums) {
         Arrays.sort(nums);
        double c=0;
        ArrayList<Double> list = new ArrayList<>();
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {
            c=(nums[i]+nums[j])/2.0;
            i++;
            j--;
            list.add(c);
        }
        Collections.sort(list);
        double t=list.get(0);
        return t;
        
    }
}