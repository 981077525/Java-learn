public class PrimeNumber2{
    public static void main(String[] args)
    {
        int count = 0;
        for (int i =100;i<1000;i++)
        {
            if(isPrimeNumber(i) == 1)
            {
                count++;
            }
        }
        System.out.printf("三位整数中质数的数量为：");
        System.out.print(count + "个");
    }
    public static int isPrimeNumber(int a)
    {
        if(a == 1)
        {
            return 1;
        }
        for(int i = 2;i<a;i++)
        {
            if(a % i == 0)
            {
                return 0;
            }
        }
        return 1;
    }
}