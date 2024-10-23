class Solution {
    int [] arr = new int[26];
    boolean util(String str)
       {
        for(int i=0;i<str.length();i++)
        {
            if(arr[str.charAt(i)-'a']<1)
            {
                return false;
            }
        }
        return true;
       }
    public int countConsistentStrings(String allowed, String[] words) {
    
    
       
       for(int i=0;i<allowed.length();i++)
       {
        int x=allowed.charAt(i)-'a';
        arr[x]++;
       }
       int count=0;
       for(String str: words)
       {
        
          if(util(str))
          {
            count++;
          }
       }
      return count;  
    }
    
}