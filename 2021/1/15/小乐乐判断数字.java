import java.util.Scanner;

//题目描述
//KiKi想知道从键盘输入的两个数的大小关系，请编程实现。
//输入描述:
//题目有多组输入数据，每一行输入两个整数（范围（1 ~231-1），用空格分隔。
//输出描述:
//针对每行输入，输出两个整数及其大小关系，数字和关系运算符之间没有空格，详见输入输出样例。
public class JudgeSize {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        while(scanf.hasNext())
        {
            int a = scanf.nextInt();
            int b = scanf.nextInt();
            if(a>b)
            {
                System.out.printf("%d>%d\n",a,b);
            }else if(a==b)
            {
                System.out.printf("%d=%d\n",a,b);
            }
            else{
                System.out.printf("%d<%d\n",a,b);
            }
        }
    }
}
