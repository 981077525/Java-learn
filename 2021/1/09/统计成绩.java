import java.util.Scanner;

//题目描述
//输入n科成绩（浮点数表示），统计其中的最高分，最低分以及平均分。
//输入描述:
//两行，
//第1行，正整数n（1≤n≤100）
//第2行，n科成绩（范围0.0~100.0），用空格分隔。
//输出描述:
//输出一行，三个浮点数，分别表示，最高分，最低分以及平均分（小数点后保留2位），用空格分隔。
public class StatisticalRescult {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int n = scanf.nextInt();
        double[] arr = new double[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = scanf.nextDouble();
        }
        double max = 0;
        double min = 0;
        double average = 0;
        for(int i= 0;i<n;i++)
        {
            average += arr[i];
        }
        average = average / n;
        max = maxAndMin(arr)[0];
        min = maxAndMin(arr)[1];
        System.out.printf("%.2f %.2f %.2f",max,min,average);
    }
    public static double[] maxAndMin(double arr[])
    {
        double[] ret = new double[]{arr[0], arr[0]};
        for(int i =0;i<arr.length;i++)
        {
            if(ret[0] < arr[i])
            {
                ret[0] = arr[i];
            }
            if(ret[1] > arr[i])
            {
                ret[1] = arr[i];
            }
        }
        return ret;
    }
}
