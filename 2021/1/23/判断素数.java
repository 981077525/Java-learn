
//题目：判断101-200之间有多少个素数，并输出所有素数。
public class 判断素数 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 101;i<201;i++){
            if(primeNumber(i))
            {
                count++;
                System.out.printf("%d  ",i);
            }
        }
        System.out.println("\n素数的个数为：" + count);
    }
    public static boolean primeNumber(int num){
        for(int i = num-1;i>1;i--)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
