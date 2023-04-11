class Solution {
    public int hIndex(int[] citations) {
        
        int n=citations.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(citations[mid]==n-mid){
                ans=n-mid;
                return ans;
                
            }
            else if(citations[mid]<n-mid){
                low=mid+1;
            }else if(citations[mid]>n-mid){
                high=mid-1;
            }
            
            
            
        }
        return n-low;
    }
}