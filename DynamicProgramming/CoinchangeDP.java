package DynamicProgramming;
public class CoinchangeDP {
    public static void main(String[] args) {
        coinChange(new int[]{1,2,5}, 11);
    }
    public static void coinChange(int[] coins, int amount) {
        int[] st = new int[amount+1];
        st[0]=1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j < st.length; j++) {
                if(j - coins[i] >=0){
                    if(j - coins[i] ==0) st[j] =1;
                    else
                        if(st[j] ==0){
                            st[j] +=st[j - coins[i]];
                        }
                        else{
                            st[j] =Math.min(st[j - coins[i]],st[j]);
                        }
                }
            }
        }
        System.out.println(st[st.length-1]);
    }
}
