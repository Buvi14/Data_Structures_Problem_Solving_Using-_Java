package DynamicProgramming;
public class Subsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc","ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {
        int[][] st = new int[s.length()+1][t.length()+1];
        for (int i = 0; i < s.length()+1; i++) {
            for (int j = 0; j < t.length()+1; j++) {
                if(i==0){
                    st[i][j] = 0;
                }
                else if(j==0){
                    st[i][j]=0;
                }
                else if(s.charAt(i-1)==t.charAt(j-1)){
                    st[i][j] = st[i-1][j-1]+1;
                }
                else{
                    st[i][j] = Math.max(st[i-1][j],st[i][j-1]);
                }
            }
        }
        // for (int i = 0; i < st.length; i++) {
        //     for (int j = 0; j < st[0].length; j++) {
        //         System.out.print(st[i][j]);
        //     }
        //     System.out.println();
        // }
        if(s.length() == st[st.length-1][st[0].length-1]){
            return true;
        }
        else{
            return false;
        }
    }
}
