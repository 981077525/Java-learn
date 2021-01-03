//作业标题
//求阶乘和
//作业内容
//求1！+2！+3！+4！+........+n!的和
public class FactorialSum {
    public static void main(String[] args) {
        System.out.println(factorialSum(3));
    }
    public static int factorialSum(int num)
    {
        int sum = 0;
        for(int i = 1;i<=num;i++)
        {
            sum += factorial(i);
        }
        return sum;
    }
    //返回一个数的阶乘
    public static int factorial(int num)
    {
        int fac = 1;
        for(int i =1;i<=num;i++)
        {
            fac *= i;
        }
        return fac;
    }
}
