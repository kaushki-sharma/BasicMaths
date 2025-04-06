class Solution {
    public int heightChecker(int[] h) {
        int n=h.length;
        int [] arr=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=h[i];
        }
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=h[i])
            {
                c++;
            }
        }
        return  c;
        
        
    }
}