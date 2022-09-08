class Solution {
    public int numberOfMatches(int n) 
    {
        int total_match=0;
        while(n>1)
        {
             if(n%2==0)
            {
                 total_match= total_match+n/2;
                 n/=2;
            }
            else
            {
                total_match=total_match +(n-1)/2;
                n=((n-1)/2)+1;
            }
        }
        return total_match;
    }
}