import java.util.Scanner;

//题目描述
//从键盘输入5个人的身高（米），求他们的平均身高（米）。
//输入描述:
//一行，连续输入5个身高（范围0.00~2.00），用空格分隔。
//输出描述:
//一行，输出平均身高，保留两位小数。
public class AverageHeight {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        double height=0;
        double sum = 0;
        for(int i =0;i<5;i++)
        {
            height = scanf.nextDouble();
            sum += height;
        }
        double averageheight = sum / 5;
        System.out.printf("%.2f",averageheight);
    }
}
