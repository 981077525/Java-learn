import java.util.Scanner;

//题目描述
//这是一个非常简单的题目，意在考察你编程的基础能力。千万别想难了哦。输入为一行，
// 包括了用空格分隔的四个整数a、b、c、d（0 < a, b, c, d < 100,000）。输出为一行，为“(a+b-c)*d”的计算结果。
//输入描述:
//输入为一行，用空格分隔的四个整数a、b、c、d（0 < a, b, c, d < 100,000）。
//输出描述:
//输出为一行，为“(a+b-c)*d”的计算结果。
public class FuncReturnValue {
    public static void main(String[] args) {
        Scanner scanf =new Scanner(System.in);
        int a = scanf.nextInt();
        int b = scanf.nextInt();
        int c = scanf.nextInt();
        int d = scanf.nextInt();
        int n = (a+b-c) * d;
        System.out.println(n);
    }
}
