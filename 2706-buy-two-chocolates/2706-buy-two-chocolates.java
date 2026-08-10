class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int a=prices[0]+prices[1];
        if(a<=money)return money-a;
        return money;
    }
}