package day05_4_15;

import java.util.*;

public class OneMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        String palindrome = "";
        char[] str1arr = str1.toCharArray();
        Stack<String> stack = new Stack<>();

        // i 控制插入的缝隙
        // j 控制字符串
        int i = 0;
        while (i<=str1arr.length){
            if(i == str1arr.length){
                palindrome = str1+str2;
            }else {
                for (int j = 0; j < str1arr.length; j++) {
                    if (i == j) {
                        palindrome += str2;
                    }
                    palindrome += str1arr[j];
                }
            }
            stack.push(palindrome);
            palindrome = "";
            i++;
        }
        int count = 0;
        while(!stack.empty()){
            if(isPalindrome(stack.pop())){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPalindrome(String string) {
        char[] strarr = string.toCharArray();
        String strpal = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < strarr.length; i++) {
            stack.push(strarr[i]);
        }

        while (!stack.empty()) {
            strpal += stack.pop();
        }

        if (strpal.equals(string)) {
            return true;
        } else {
            return false;
        }
    }
}
