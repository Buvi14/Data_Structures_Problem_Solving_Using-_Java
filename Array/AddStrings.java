package Array;

// Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

// You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("0", "472"));
    }

    public static String addStrings(String num1, String num2) {
        if (num1 == "0") {
            return num2;
        }
        if (num2 == "0") {
            return num1;
        }
        StringBuilder res = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; j >= 0 || i >= 0 || carry > 0; i--, j--) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            res = res.append(sum % 10);
        }
        return res.reverse().toString();
    }
}
