public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) 
    {   
        int oneBits=0;
        for(int i=0;i<32;i++)
        {
            
            if ((n & 1) == 1)   // if the rightmost bit is 1, then increase the count
            {
                oneBits++; 
            }
            else if (n == 0)   // early return if all the bits are 0's;
            {
                return oneBits; 
            }
            n = n >> 1;       // shift bits to the right
        }
        return oneBits;
    }
}