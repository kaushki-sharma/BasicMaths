class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
         HashMap<Integer, Integer> map = new HashMap<>();
         for(int i:nums)
         {
            map.put(i,map.getOrDefault(i, 0) + 1);
         }
         for(HashMap.Entry<Integer,Integer>e:map.entrySet())
         {
            if(e.getValue()>n)
            {
                return e.getKey();
            }

         }
         return 0;


        
    }
}