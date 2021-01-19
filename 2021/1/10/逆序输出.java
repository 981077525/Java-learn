import java.util.Scanner;

//题目描述
//输入10个整数，要求按输入时的逆序把这10个数打印出来。逆序输出，就是按照输入相反的顺序打印这10个数。
//输入描述:
//一行，输入10个整数（范围-231~231-1），用空格分隔。
//输出描述:
//一行，逆序输出输入的10个整数，用空格分隔。题目描述
//输入10个整数，要求按输入时的逆序把这10个数打印出来。逆序输出，就是按照输入相反的顺序打印这10个数。
//输入描述:
//一行，输入10个整数（范围-231~231-1），用空格分隔。
//输出描述:
//一行，逆序输出输入的10个整数，用空格分隔。
public class RevweseOrder {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i= 0;i<10;i++)
        {
            arr[i] = scanf.nextInt();
        }
        for(int i = 9;i>=0;i--)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
}
