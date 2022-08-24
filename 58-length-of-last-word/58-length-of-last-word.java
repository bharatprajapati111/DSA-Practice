class Solution {
    public int lengthOfLastWord(String s) 
    {
        int l=s.length()-1;
        int count=0;
        for(int i=l;i>=0;i--)
        {
           if(s.charAt(i)!=' ')
            {
                count++;
            }
            else
            {
                if(count>0)
                {
                    return count;
                }
            }
        }
        return count;
    }
}