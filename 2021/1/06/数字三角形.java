import java.util.Scanner;

//题目描述
//KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用数字组成的数字三角形图案。
//输入描述:
//多组输入，一个整数（3~20），表示数字三角形边的长度，即数字的数量，也表示输出行数。
//输出描述:
//针对每行输入，输出用数字组成的对应长度的数字三角形，每个数字后面有一个空格。
public class NumberTriangle {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        while(scanf.hasNext())
        {
            int num = scanf.nextInt();
            for (int i =1;i<=num;i++)
            {
                for(int j =1;j<=i;j++)
                {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
