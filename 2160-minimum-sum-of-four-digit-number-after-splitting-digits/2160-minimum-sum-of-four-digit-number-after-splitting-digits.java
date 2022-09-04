class Solution {
    public int minimumSum(int num) 
    {
        int []arr = new int [4];
        for(int i =0; i<4; i++)
        {
        arr[i]=num%10;
        num/=10;
        }
        Arrays.sort(arr);
    
        int num1 = (arr[0]*10)+ arr[2];
        int num2 = (arr[1]*10)+ arr[3];
        int sum = num1 + num2;
        return sum;
    }
}



/*Trick :- when you sort the integer num with the help of array then the least sum will always be the (1st-3rd) digit + (2nd-4th) digit.
like 2932 -----> 2239(after sort) -------> (210+3) + (210+9) --------> 23 + 29 --------> 52.
like 4009 -----> 0049(after sort) -------> (010+4) + (010+9) --------> 04 + 09 --------> 13.*/