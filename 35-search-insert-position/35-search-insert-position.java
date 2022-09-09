class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int lastElement = nums[nums.length - 1];
        if (target > lastElement) 
        {
            return nums.length;
        }
        if (target == lastElement) 
        {
            return nums.length - 1;
        }
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == target) 
            {
                return i;
            }
            if(nums[i] > target) 
            {
                return i;
            }
        }
        return -1;
    }
}