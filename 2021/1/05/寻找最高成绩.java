import java.util.Scanner;

//题目描述
//KiKi知道了大一三科比较重要课程的分数，包括：程序设计基础，高数，英语，请编程帮他找到三科中的最高分。
//输入描述:
//一行，三个整数，用空格分隔，代表三科成绩。
//输出描述:
//一行，一个整数，代表输入三科分数中的最高分数。
public class MaxExam {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int a = scanf.nextInt();
        int b = scanf.nextInt();
        int c = scanf.nextInt();
        System.out.println(maxThree(a,b,c));
    }
    public static int maxThree(int a,int b, int c)
    {
        return maxTwo(maxTwo(a,b),c);
    }
    public static int maxTwo(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }
    }
}
