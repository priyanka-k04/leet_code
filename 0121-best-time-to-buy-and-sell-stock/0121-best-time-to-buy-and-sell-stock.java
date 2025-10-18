class Solution {
    public int maxProfit(int[] prices) {
        int bp=prices[0], p=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<bp){
                bp=prices[i];
            }else{
                int cp=prices[i]-bp;
                p=Math.max(cp,p);
            }
        }
        return p;
        
    }
}