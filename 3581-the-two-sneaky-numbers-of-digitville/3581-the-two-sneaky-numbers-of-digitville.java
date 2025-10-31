class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer>  map= new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> res=new ArrayList<>();
        for(int num:nums){
            if(map.get(num)==2){
                res.add(num);
                map.put(num,-1);
            }
        }
        int[] result=new int[res.size()];
        for(int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;
    }
}