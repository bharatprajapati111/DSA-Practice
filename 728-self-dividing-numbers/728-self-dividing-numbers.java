class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        ArrayList l1=new ArrayList();
        int count=0;
        int x=0;
        int r=0;
        for(int i=left;i<=right;i++)
        {
            count=0;
            x=i;
            while(x!=0)
            {
                r=x%10;
                if(r==0)
                {
                    count++;
                    break;
                }
                else
                {
                    if(i%r!=0)
                    {
                        count++;
                    }
                    x=x/10;
                }
            }
            if(count==0)
            {
            l1.add(i);
            }
        }
        return l1;
    }
}