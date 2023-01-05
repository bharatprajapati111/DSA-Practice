class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        List<List<Integer>> results=new ArrayList<List<Integer>>();
        List<Integer> comb=new ArrayList<Integer>();
        backtrack(n, k, comb, 1, results);
        return results;
    }
     protected void backtrack(int remain, int k, List<Integer> comb, int next_start, List<List<Integer>> results )
     {
        if(remain==0 && comb.size()==k)
        {
            results.add(new ArrayList<Integer>(comb));
        }
         else if(remain<0)
         {
             return;
         }
        for(int i=next_start;i<=9;++i)
        {
                comb.add(i);
                backtrack(remain-i,k,comb,i+1,results);
                comb.remove(comb.size()-1);
        }
    }
    
}