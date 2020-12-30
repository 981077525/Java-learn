import java.util.Scanner;

public class NarcissusNumber {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        while(scanf.hasNextInt())
        {
            int num = scanf.nextInt();
            if(narcissusNumber(num))
            {
                System.out.println(num + "是水仙花数");
            }else{
                System.out.println(num + "不是水仙花数");
            }
        }
    }
    //判断是否为水仙花数
    //如果是则返回：true
    //如果不是返回：false
    public static boolean narcissusNumber(int num)
    {
        int digit = digit(num);
        int sum = 0;
        int num2 = num;
        for(int i=0;i<digit;i++)
        {

            int a = num2 % 10;
            int r = power(a,digit);
            num2 /= 10;
            sum +=r;
        }
        if(sum == num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //计算一个数a的b次方
    public static int power(int a,int b)
    {
        int sum = 1;
        for(int i =0;i<b;i++)
        {
            sum *=a;
        }
        return sum;
    }
    //计算一个数有多少位
    public static int digit(int num)
    {
        int count = 0;
        while(num>0)
        {
            num /= 10;
            count++;
        }
        return count;
    }
}
