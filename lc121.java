class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)return 0;
        int min = prices[0],res=0;
        for(int i = 1; i<prices.length;i++){
            if(prices[i]<min) min = prices[i];
            if(prices[i]-min>res) res = prices[i]-min;
        }
        return res;
    }
}