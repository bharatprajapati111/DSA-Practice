class Solution {
    public int[] getConcatenation(int[] nums) 
    {
        int n=nums.length;
        int[] ans = new int[nums.length *2];
        for(int i=0;i<nums.length*2;i++)
        {
            if(i<nums.length )
            {
                ans[i]=nums[i];
            }
            else
                ans[i]=nums[i-n];
        }
        return ans;
    }
}
