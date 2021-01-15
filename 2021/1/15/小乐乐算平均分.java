import java.util.Scanner;

//题目描述
//小乐乐输入三科成绩，请编程帮他输出三科成绩总分及平均分。
//输入描述:
//一行，3科成绩（浮点数），成绩之间用一个空格隔开。
//输出描述:
//一行，总分和平均分（小数点后保留两位），用一个空格隔开。
public class Average {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        double a = scanf.nextDouble();
        double b = scanf.nextDouble();
        double c = scanf.nextDouble();
        System.out.printf("%.2f %.2f",a+b+c,(a+b+c) / 3);
    }
}
