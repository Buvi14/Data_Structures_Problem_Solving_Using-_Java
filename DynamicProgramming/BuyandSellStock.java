package DynamicProgramming;
public class BuyandSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7}));
    }
    public static int maxProfit(int[] prices) {
        int[] st = new int[prices.length];
        st[0]=0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            st[i] = Math.max(st[i-1], prices[i]-min);
            min = Math.min(prices[i],min);
        }
        return st[st.length-1];
    }
}
