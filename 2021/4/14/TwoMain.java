package day04_4_14;

import java.util.Scanner;
import java.util.Stack;

public class TwoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // 几进制 就代表的任何位上的最高位是 n-1
        // 满 n 进 1

        System.out.println(baseConversion(m, n));
    }

    public static String baseConversion(int m, int n) {

        String ret = "";
        Stack<Character> stack = new Stack<>();

        while( m != 0){
            stack.push(baseNumber(m % n));
            m /= n;
        }

        while (!stack.empty()){
            ret += stack.pop();
        }
        return ret;
    }


    /*
    *   返回数字对应的进制数
    * */
    public static char baseNumber(int num) {
        switch (num) {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            case 9:
                return '9';
            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';
            case 14:
                return 'E';
            case 15:
                return 'F';
            default:
                return '#';
        }
    }
}
