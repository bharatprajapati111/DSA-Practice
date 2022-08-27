class Solution {
    public int majorityElement(int[] nums) 
    {
        int majorityElem = 0;
		int count = 0;
		for(int i=0; i<nums.length; i++) 
        {
			if(count == 0) 
            {
				majorityElem = nums[i];
				count++;
			}
            else if(nums[i] == majorityElem) 
            {
				count++;
			}
            else 
            {
				count--;
			}
		}
		return majorityElem;
    }
}