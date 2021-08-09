package DynamicProgramming;
public class LongestPalindrome {
    public static void main(String[] args) {
        longestPalindrome("aaaaa");
    }
    public static String longestPalindrome(String s) {
        String str ="";
        boolean[][] bst = new boolean[s.length()][s.length()];
        String[][] st = new String[s.length()][s.length()];
        for (int gap = 0; gap < s.length(); gap++) {
            for (int i=0,j=gap; j < s.length();i++,j++) {
                if(gap == 0){
                    bst[i][j]= true;
                    st[i][j] = ""+s.charAt(i);
                    str = st[i][j];
                }
                else if(gap == 1){
                    if(s.charAt(i) == s.charAt(j)){
                        bst[i][j] = true;
                        st[i][j] = st[i][j-1]+s.charAt(i);
                        str = st[i][j];
                    }
                }
                else{
                    if(s.charAt(i)==s.charAt(j)){
                        if(bst[i+1][j-1] == true){
                            bst[i][j] = true;
                            st[i][j] = s.charAt(i)+st[i+1][j-1]+s.charAt(j);
                            str = st[i][j];
                        }
                    }
                }
            }
        }
        for (int i = 0; i < bst.length; i++) {
            for (int j = 0; j < bst[0].length; j++) {
                System.out.print(bst[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < st.length; i++) {
            for (int j = 0; j < st[0].length; j++) {
                System.out.print(st[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(str);
        return str;
    }
}
