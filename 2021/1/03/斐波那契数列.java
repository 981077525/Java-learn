import java.util.Scanner;

//斐波那契数列（Fibonacci sequence），又称黄金分割数列、因数学家莱昂纳多·斐波那契（Leonardoda Fibonacci）
// 以兔子繁殖为例子而引入，故又称为“兔子数列”，指的是这样一个数列：0、1、1、2、3、5、8、13、21、34、……
// 在数学上，斐波那契数列以如下被以递推的方法定义：F(0)=0，F(1)=1, F(n)=F(n - 1)+F(n - 2)（n ≥ 2，n ∈ N*）
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        while(scanf.hasNextInt())
        {
            int n = scanf.nextInt();
            System.out.println(fibonacciNumber(n));
        }
    }
    public static int fibonacciNumber(int a)
    {
        if(a == 1)
        {
            return 0;
        }
        if(a == 2)
        {
            return 1;
        }
        return fibonacciNumber(a-1) + fibonacciNumber(a-2);
    }
}
