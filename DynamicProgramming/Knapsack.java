package DynamicProgramming;

public class Knapsack {
    public static void main(String[] args) {
        int[] wt = {2,5,1,3,4};
        int[] val = {15,14,10,45,30};
        // System.out.println(knapsack(50, new int[]{10,20,30}, new int[]{60,100,120}, 3));
        int[][] strg = new int[wt.length+1][8];
        // System.out.println(knapsack_strg(7,wt,val,val.length,strg));
        // KnapsackTab(7,wt,val,val.length);
        long st = System.currentTimeMillis();
        System.out.println(knapsack_rec_practice(7, wt, val, val.length));
        long et = System.currentTimeMillis();
        System.out.println(et-st+"rec_end /// ");
        long st1 = System.currentTimeMillis();
        System.out.println(knapsack_memo_practice(7, wt, val, val.length, strg));
        long et1 = System.currentTimeMillis();
        System.out.println(et1-st1+"memo_end /// ");
        long st2 = System.currentTimeMillis();
        System.out.println(knapsack_tab_practice(7, wt, val, val.length));
        long et2 = System.currentTimeMillis();
        System.out.println(et2-st2+"tab_end /// ");
        
    }

    public static int knapsack_tab_practice(int w, int[] wt, int[] val, int n ){
        int[][] strg = new int[n+1][w+1];
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <= w; j++) {
                if(i==0 || j==0){
                    strg[i][j]=0;
                }
                else{
                    if(wt[i-1] <= j){
                        strg[i][j] = Math.max(strg[i-1][j], strg[i-1][j-wt[i-1]]+val[i-1]);
                    }
                    else{
                        strg[i][j] = strg[i-1][j];
                    }
                }
            }  
        }
        return strg[n][w];
    }

    public static int knapsack_memo_practice(int w, int[] wt, int[] val, int n, int[][] strg) {
        if(n==0 || w==0){
            return 0;
        }
        if(strg[n][w]!=0){
            return strg[n][w];
        }

        if(wt[n-1] <= w){
            return strg[n][w] = Math.max(knapsack_memo_practice(w, wt, val, n-1, strg), knapsack_memo_practice(w-wt[n-1], wt, val, n-1, strg)+val[n-1]);
        }
        else{
            return strg[n][w] = knapsack_memo_practice(w, wt, val, n-1, strg);
        }
    }


    public static int knapsack_rec_practice(int w, int[] wt, int[] val, int n){
        if(w==0 || n==0){
            return 0;
        }
        if(wt[n-1] <= w){
            return Math.max(knapsack_rec_practice(w, wt, val, n-1), knapsack_rec_practice(w-wt[n-1], wt, val, n-1)+val[n-1]);
        }
        else{
            return knapsack_rec_practice(w, wt, val, n-1);
        }
    }

    














    // Using tabulation
    public static void KnapsackTab(int w, int[] wt,int[] val,int n){
        int[][] strg = new int[n+1][w+1];
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <= w; j++) {
                if(i==0){
                    strg[i][j]=0;
                }
                else if(j==0){
                    strg[i][j]=0;
                }
                else{
                    if(wt[i-1]<=j){
                        strg[i][j] = Math.max(val[i-1]+strg[i-1][j-wt[i-1]],strg[i-1][j]);
                    }
                    else{
                        strg[i][j] = strg[i-1][j];
                    }
                }
            }
        }
        System.out.println(strg[n][w]);
    }
    // Using Recursion
    public static int knapsack(int W, int[] wt,int[] val,int n){
        if(W==0 || n==0){
            return 0;
        }
        if(wt[n-1]<=W){
            return Math.max(knapsack(W, wt, val, n-1),knapsack(W-wt[n-1], wt, val, n-1)+val[n-1]);
        }
        else{
            return knapsack(W, wt, val, n-1);
        }
    }

    // Using memoization

    public static int knapsack_strg(int W, int[] wt,int[] val,int n,int[][] strg){
        if(W==0 || n==0){
            return 0;
        }
        if(strg[W][n]!=0){
            return strg[W][n];
        }
        if(wt[n-1]<=W){
            return strg[W][n]=Math.max(knapsack_strg(W, wt, val, n-1,strg),knapsack_strg(W-wt[n-1], wt, val, n-1,strg)+val[n-1]);
        }
        else{
            return strg[W][n]=knapsack_strg(W, wt, val, n-1,strg);
        }
    }

    
}
