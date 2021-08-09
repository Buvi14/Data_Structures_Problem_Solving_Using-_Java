package Array;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverseWord("geeks"));
    }
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String res="";
        for(int i=str.length()-1;i>=0;i--){
            res += str.charAt(i);
        }
        return res;
    }
}
