class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i : nums) set.add(i); // removing duplicate elements

       for(int i = 1; i <= nums.length; i++){
           if(!set.contains(i)) result.add(i);
       }
        return result;
    }
}