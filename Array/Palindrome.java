package Array;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome_func(121));
    }
    public static boolean palindrome_func(int x){
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        int temp=x,rem=0,sum=0;
        while(x>0){
            rem = x%10;
            sum = (sum*10)+rem;
            x=x/10;
        }
        if(temp == sum){
            return true;
        }
        return false;
    }
}
