package String;

public class FlipString {
    public static void main(String[] args) {
        System.out.println(minFlipsMonoIncr("010110"));
    }
    public static int minFlipsMonoIncr(String s) {
        int[][] strg = new int[2][s.length()+1];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='0'){
                strg[0][i+1]= strg[0][i];
                strg[1][i+1] = 1+ Math.min(strg[0][i], strg[1][i]);
            }
            else{
                strg[0][i+1] = 1+ strg[0][i];
                strg[1][i+1] = Math.min(strg[0][i], strg[1][i]);
            }
        }
        return Math.min(strg[0][s.length()], strg[1][s.length()]);
    }
}
