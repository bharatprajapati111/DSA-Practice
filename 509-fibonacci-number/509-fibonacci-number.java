class Solution {
    public int fib(int n) 
    {
        if(n<=1)
        {
            return n;
        }
        if(n==2)
        {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}



/*class Solution {
    public int fib(int n) 
    {
        int a=0;
        int b=1;
        int s=0;
        if(n==1)
        {
            return 1;
        }
        for(int i=2;i<=n;i++)
        {
            s=a+b;
            a=b;
            b=s;
        }
        return s;
    }
}*/







