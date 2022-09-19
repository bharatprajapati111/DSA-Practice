class Solution {
    public boolean isHappy(int n) 
    {
        if (n<7 && n>1)
        {  
            return false;
        }
		int sum = 0;
		//here base condition 
		
        if (n == 1)
        {
            return true; 
        }            
		while (n > 0) 
        {
			int digit = n % 10;              //we taking last element 
			sum = sum + (digit * digit);     //squre it
			n = n / 10;                      //remove the last elment
		}
	
        //there we are recursion the results of after (squre and adding) new value is sum	
		return isHappy(sum);
    }
}