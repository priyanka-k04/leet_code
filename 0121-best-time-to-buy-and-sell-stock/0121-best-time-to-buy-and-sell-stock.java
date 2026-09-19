class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int maxprice=0;
        for(int i=1;i<prices.length; i++){
            int currprice=prices[i]-minprice;
            maxprice=Math.max(currprice, maxprice);
            minprice=Math.min(minprice, prices[i]);
        }
        return maxprice;
        
    }
}