import java.util.Scanner;

//题目描述
//KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的X形图案。
//输入描述:
//多组输入，一个整数（2~20），表示输出的行数，也表示组成“X”的反斜线和正斜线的长度。
//输出描述:
//针对每行输入，输出用“*”组成的X形图案。
public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        while(scanf.hasNextInt())
        {
            int num = scanf.nextInt();
            for (int i =0;i<num;i++)
            {
                //i控制行
                for (int j =0;j<num;j++)
                {
                    //j控制列
                    if (i == j || j == num-i-1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
