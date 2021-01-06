import java.util.Scanner;

//题目描述
//公务员面试现场打分。有7位考官，从键盘输入若干组成绩，每组7个分数（百分制），去掉一个最高分和一个最低分，输出每组的平均成绩。
//输入描述:
//一行，输入7个整数（0~100），代表7个成绩，用空格分隔。
//输出描述:
//一行，输出去掉最高分和最低分的平均成绩，小数点后保留2位，每行输出后换行。
public class CivilInterview {
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i = 0;i<7;i++) {
            arr[i] = scanf.nextInt();
        }
        arr = bubblingSort(arr);
        double sum = 0;
        for(int i =1;i<6;i++)
        {
            sum +=arr[i];
        }
        System.out.printf("%.2f",sum/5);
    }
    public static int[] bubblingSort(int[] arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            for(int j = i +1;j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
