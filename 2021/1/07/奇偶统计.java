import java.util.Scanner;

//题目描述
//任意输入一个正整数N，统计1~N之间奇数的个数和偶数的个数，并输出。
//输入描述:
//一行，一个正整数N。（1≤N≤100,000）
//输出描述:
//一行，1~N之间奇数的个数和偶数的个数，用空格分开。
public class ParityNumCount {
    public static void main(String[] args) {
        Scanner scanf =new Scanner(System.in);
        int n = scanf.nextInt();
        int countj = 0;
        int counto = 0;
        for(int i =1;i<=n;i++)
        {
            if(i % 2 == 0)
            {
                counto++;
            }
            else{
                countj++;
            }
        }
        System.out.printf("%d %d",countj,counto);
    }
}
