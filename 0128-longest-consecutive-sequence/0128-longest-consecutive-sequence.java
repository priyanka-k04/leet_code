class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> set=new HashSet<>();
      for(int n:nums) set.add(n);
        int max=0;
      for(int n:set){
        if(!set.contains(n-1))
        {
            int curr=n;
            while(set.contains(++curr));
            max=Math.max(max,(curr-n));

        }
      }
      return max;
    }
}