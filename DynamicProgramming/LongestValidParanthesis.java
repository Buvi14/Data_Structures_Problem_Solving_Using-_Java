package DynamicProgramming;

import java.util.Stack;

public class LongestValidParanthesis {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()(()"));
    }
    public static int longestValidParentheses(String s) {
        if(s==""){
            return 0;
        }
        Stack<Character> st = new Stack<>();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(st.empty()){
                st.push(s.charAt(i));
            }
            else if (!st.empty()){
                if((s.charAt(i)== ')'  && st.peek()== '(') )
                {
                    st.pop();
                    count+=2;
                }    
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        return count;
    }
}
