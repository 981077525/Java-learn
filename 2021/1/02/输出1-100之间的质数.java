public class PrimeNumber3 {
    //输出1-100之间的所有质数
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
    //判断是否为质数
    public static boolean isPrime(int num)
    {

        for(int i = 2; i<num;i++)
        {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
