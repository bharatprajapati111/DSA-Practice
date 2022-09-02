class Solution {
    public int finalValueAfterOperations(String[] operations) 
    {
        int x = 0;
        for(String s : operations)
        {
            //operations[i] will be either "++X", "X++", "--X", or "X--"
            if(s.startsWith("++") || s.endsWith("++"))
            {
                x++;
            }
            else
            {
                x--;
            }
        }
        return x;
    }
}