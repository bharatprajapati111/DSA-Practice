class Solution {
    public int numberOfSteps(int num) 
    {
        int count=0;
        int count1=0;
        int res=0;
        while(num>0)
        {
            if(num%2==0)
            {
                num=num/2;
                count++;
            }
            else
            {
                num=num-1;
                count1++;
            }
             res=count+count1;
        }
        return res;

    }
}