class Solution {
    public boolean isPalindrome(int x) {
        int prevnumber=x;
        if(x<0)
        {
            return false;
        }
        else
        { int rev=0;
            while(x!=0)
            {
            int rem=x%10;
             rev=rev*10+rem;
            x=x/10;

            }
            if(prevnumber==rev)
            {
                return true;
            }
            else 
            {
                return false;
            }

            

        }
        
    }
}