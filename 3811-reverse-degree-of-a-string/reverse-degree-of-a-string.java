class Solution {
    public int reverseDegree(String s) {
        int count=0;

        for(int i=0;i<s.length();i++)
        {
            count=count+(i+1)*('z'-(int)s.charAt(i)+1);

        }
        return count;
        
    }
}