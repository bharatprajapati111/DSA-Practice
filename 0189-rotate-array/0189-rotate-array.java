class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; // for length of array is less to k
        if(k < 0){ // for -ve value
            k += nums.length;
        }
        
         //complete rotate array
        reverse(nums, 0, nums.length - 1);

        //K part reversal
        reverse(nums, 0, k-1);

        //Non K part reversal
        reverse(nums, k, nums.length -1);
    }

    private void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}












// 2nd Solution

/*class Solution {
    public void rotate(int[] nums, int k) 
    {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[(i+k)%nums.length]=nums[i];
        }
        for(int i=0; i<ans.length; i++)
        {
            nums[i]=ans[i];
        }
    }
} */