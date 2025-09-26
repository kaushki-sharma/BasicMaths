class Solution {
    public double myPow(double x, int n) {

        if(n==0)
        {
        return 1;
        }
        if(n<0)
        {
            x=1/x;
            if (n == Integer.MIN_VALUE) {
            return x * myPow(x, -(n + 1));
            }
            n= (-1)*n;
    
        }
        

        double xnp2=myPow(x,n/2);
        double xn=xnp2*xnp2;
        if(n%2==1)
        {
            return xn=xn*x;
        }

        return xn;
        
    }
    }
