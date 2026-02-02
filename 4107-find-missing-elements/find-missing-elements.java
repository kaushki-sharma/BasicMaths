class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer>ans= new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        int max=nums[nums.length-1];
        for(int i=min;i<max;i++)
        {
             if(!map.containsKey(i))
             {
                ans.add(i);
             }  
        }
        return ans;
        
    }
}