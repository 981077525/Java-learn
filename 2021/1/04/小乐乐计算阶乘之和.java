import java.util.Scanner;
// 题目描述
// 小乐乐想计算一下1!+2!+3!+...+n!。
// 输入描述:
// 一行，一个整数n。
// 输出描述:
// 一行，一个整数，表示1!+2!+3!+...+n!的结果。
public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int num = scanf.nextInt();
        System.out.println(factorialSum(num));
    }
    public static int factorialSum(int num)
    {
        int sum = 0;
        for(int i = 1;i<=num;i++)
        {
            sum += factorial(i);
        }
        return sum;
    }
    //返回一个数的阶乘
    public static int factorial(int num)
    {
        int fac = 1;
        for(int i =1;i<=num;i++)
        {
            fac *= i;
        }
        return fac;
    }
}
