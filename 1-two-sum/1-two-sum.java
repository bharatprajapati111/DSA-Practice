class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int [] result=new int[2];
        Map map=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(target-nums[i]))
            {
                map.put(nums[i],i);
            }
            else
            {
                result[1]=i;
                result[0]=(int)map.get(target-nums[i]);
                return result;
            }
        }
        return result;
    }
}



























/*class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        for(int i=0;i<nums.length-1;i++) //traverse the array for 1st number
        {
            for(int j=i+1;j<nums.length;j++) //traverse the array for 2nd number
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}*/