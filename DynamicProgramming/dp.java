package DynamicProgramming;
/**
 * dp
 */
public class dp {

    public static void main(String[] args) {
        // System.out.println(maximizeCuts(5, 5, 3, 2));
        // System.out.println(Combination(new int[]{3,2,5}, 7));
        // max_sum_var(new int[]{5,5,10,100,10,5});
        // String str1 ="AEDFHR";
        // String str2 ="ABCH";
        // System.out.println(longest_common_subsequence(str1, str2));
        // System.out.println(palindrome_substring("abccbd"));
        System.out.println(MinPalindrome_Cut("ab"));
    }

    // Minimum Palindromic cut
    public static int MinPalindrome_Cut(String str){
        int[][] strg = new int[str.length()][str.length()];
        for(int gap =0;gap<str.length();gap++){
            for(int i=0,j=gap;j<str.length();i++,j++){
                if(gap==0){
                    strg[i][j] = 0;
                }else if(gap==1){
                    if(str.charAt(i)==str.charAt(j)){
                        strg[i][j] = 0;
                    }else{
                        strg[i][j]=1;
                    }
                }else{
                    if(str.charAt(i)==str.charAt(j)&&strg[i+1][j-1]==0){
                       strg[i][j] = 0; 
                    }else{
                        int min = Integer.MAX_VALUE;
                        for(int idash=i+1,jdash=j-gap;jdash<j;idash++,jdash++){
                            min = Math.min(min,strg[i][jdash]+strg[idash][j]+1);
                        }
                        strg[i][j] = min;
                    }
                }
            }
        }

        return strg[0][strg.length-1];
    }

    //Longest Palindromic substring using Gap Method
    public static int palindrome_substring(String str){
        boolean[][] st = new boolean[str.length()][str.length()];
        int max = 0;
        for(int gap=0;gap<str.length();gap++){
            for(int i=0,j=gap;j<str.length();i++,j++){
                if(gap==0){
                    st[i][j]=true;
                    max=1;
                }
                else if(gap==1){
                    if(str.charAt(i)==str.charAt(j)){
                        st[i][j]=true;
                        max=2;
                    }
                }
                else{
                    if(str.charAt(i)==str.charAt(j)){
                        if(st[i+1][j-1]==true){
                            st[i][j]=true;
                            max=gap+1;
                        }
                    }
                }
            }
        }
        return max;
    }
    // Longest Common Subsequence
    public static int longest_common_subsequence(String str1,String str2){
        int[][] st = new int[str1.length()+1][str2.length()+1];
        for (int i = 0; i < str1.length()+1; i++) {
            for (int j = 0; j < str2.length()+1; j++) {
                if(i==0){
                    st[i][j] =0;
                }
                else if(j==0){
                    st[i][j]=0;
                }
                else if(str1.charAt(i-1)==str2.charAt(j-1)){
                    st[i][j]=st[i-1][j-1]+1;
                }
                else{
                    st[i][j] = Math.max(st[i-1][j], st[i][j-1]);
                }
            }
        }
        return st[st.length-1][st[0].length-1];
    }


    

    // Maximum Sum without the Adjacent Value Using variables not array
    public static void max_sum_var(int[] arr){
        int exclude=0,include=arr[0],temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            include = exclude+arr[i];
            exclude = Math.max(temp,exclude);
            temp=include;
        }
        System.out.println(Math.max(include, exclude));
    }

    // Maximum Sum without the Adjacent Value
    public static void max_sum(int[] arr){
        int exclude[] = new int[arr.length];
        int include[] = new int[arr.length];
        include[0]=arr[0];
        exclude[0]=0;
        for (int i = 1; i < arr.length; i++) {
            include[i] = exclude[i-1]+arr[i];
            exclude[i] = Math.max(include[i-1], exclude[i-1]);
        }
        System.out.println(Math.max(include[include.length-1], exclude[exclude.length-1]));
    }

    // Find the combination of given Coins
    public static int Combination(int []arr, int target){
        int st[]= new int[target+1];
        st[0]=1;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<st.length;j++){
                if(j-arr[i]>=0){
                    st[j] += st[j - arr[i]];
                } 
            }
        }
        return st[st.length-1];
    }

    
}
