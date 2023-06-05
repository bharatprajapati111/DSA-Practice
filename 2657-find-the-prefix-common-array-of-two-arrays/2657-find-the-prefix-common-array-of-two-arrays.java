class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) 
    {
        int []c=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            boolean found=false;
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    found=true;
                }
                if(found && j>=i)
                {
                    c[j]++;
                }
            }
        }
        return c;
    }
}