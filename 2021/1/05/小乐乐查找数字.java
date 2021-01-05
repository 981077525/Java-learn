import java.util.Scanner;

//题目描述
//给定n个整数和一个整数x，小乐乐想从n个整数中判断x出现几次，请编程帮他实现。
//输入描述:
//共3行
//第一行，一个整数，表示n（1 <= n <= 100）。
//第二行，共输入n个整数，两个整数之间用空格分隔。
//第三行，输入一个整数，表示要查找的整数x。
//输出描述:
//一行，表示整数x出现的次数。
public class LeLeSearchNumber {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int count =0;
        int n = scanf.nextInt();
//        int arr = new int[]{0};
        int[] arr = new int[n];
        for(int i =0;i<n;i++)
        {
            int num = scanf.nextInt();
            arr[i] = num;
        }
        int ret = scanf.nextInt();
        for(int i = 0; i<n ;i++)
        {
            if(arr[i] == ret)
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
