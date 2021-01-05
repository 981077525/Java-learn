import java.util.Scanner;

//题目描述
//KiKi这学期努力学习程序设计基础，要期末考试了，BoBo老师告诉他，总成绩包括四个部分，如下：
//总成绩 = 实验成绩 * 20% + 课堂表现成绩 * 10% + 过程考核成绩 * 20% + 期末上机考试成绩 * 50%，现在输入KiKi的各项成绩，请计算KiKi的总成绩。
//输入描述:
//一行，包括四个整数（百分制），用空格分隔，分别表示实验成绩，课堂表现成绩，过程考核成绩，期末上机考试成绩。
//输出描述:
//一行，总成绩，保留小数点一位。
public class FinalExam {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        double sum = 0;

        double exam1 = scanf.nextInt();
        double exam2 = scanf.nextInt();
        double exam3 = scanf.nextInt();
        double exam4 = scanf.nextInt();

        sum = (exam1 * 0.2) + (exam2 * 0.1) + (exam3 * 0.2) + (exam4 * 0.5);
        System.out.println(sum);
    }
}
