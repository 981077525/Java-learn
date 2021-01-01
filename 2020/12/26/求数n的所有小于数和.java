//用户输入的类文件
import java.util.Scanner;
public class SumNumber{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(sum(num));
    }
    public static long sum(int a)
    {
        long sum = 0;
        for(int i =1;i<=a;i++)
        {
            sum+=i;
        }
        return sum;
    }
}