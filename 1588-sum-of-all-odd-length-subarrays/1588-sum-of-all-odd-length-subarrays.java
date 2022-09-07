class Solution {
    public int sumOddLengthSubarrays(int[] arr) 
    {
        int n=arr.length;
        
        int total=0;
        
        for(int i=1;i<n+1;i+=2){
            int sum=0;
            
            for(int j=0;j<i;j++){
                sum+=arr[j];
            }
            
            total+=sum;
            
            int j=0,k=i;
            
            while(k<n){
                sum-=arr[j++];
                sum+=arr[k++];
                
                total+=sum;
            }
        }
        
        return total;
    }
}






















/*class Solution {
    public int sumOddLengthSubarrays(int[] arr) 
    {
        int n = arr.length;
        int sum = 0;
        for (int i=0; i<n; i++) 
        {
            sum = sum + ((i+1)*(n-i)+1)/2*arr[i]; 
        }
        return sum;
    }
}*/