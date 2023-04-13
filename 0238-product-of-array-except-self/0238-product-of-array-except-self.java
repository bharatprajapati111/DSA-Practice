class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int[] ans = new int[nums.length];
        
        for(int i = 0; i<nums.length; i++) {
            ans[i] = 1;
        }
        int pre = 1;
        int post = 1;

        for(int i = 0; i<nums.length; i++) {
            ans[i] = ans[i] * pre;
            pre = pre * nums[i];
            ans[nums.length - i - 1] = ans[nums.length - i - 1] * post;
            post = post * nums[nums.length - i - 1];
        }
        return ans;
    }
}