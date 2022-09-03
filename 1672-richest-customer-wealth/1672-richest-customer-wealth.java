class Solution {
    public int maximumWealth(int[][] accounts) 
    {
       int max = 0; //assigning the initial value to 0 for first time
        for(int i=0;i<accounts.length;i++)   //running this loop with total arrays length
        {  
            int sum =0; 
            for(int j=0;j<accounts[i].length;j++)  //running this loop with individual array's                                                          length
            {                                               
                sum = sum + accounts[i][j];
            }
            max=Math.max(max,sum); // condition to check if current total wealth is greater than                                       the current calculated individual's wealth
        }
        return max;
    }
}