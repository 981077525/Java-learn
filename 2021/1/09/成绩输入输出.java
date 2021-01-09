import java.util.Scanner;

//题目描述
//输入10科成绩，换行显示输入的10科成绩。
//输入描述:
//一行，输入10科成绩（整数表示，范围0~100），用空格分隔。
//输出描述:
//一行，输出输入的10科成绩，用空格分隔。
public class ScoreInOut {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0;i<10;i++)
        {
            arr[i] = scanf.nextInt();
        }
        for(int i = 0;i<10;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
}
