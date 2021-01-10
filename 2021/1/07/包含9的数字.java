//题目描述
//今年是2019年，KiKi想知道1~2019中有多少个包含数字9的数。包含数字的数是指有某一位是“9”的数，例如“2019”、“199”等。
//输入描述:
//无
//输出描述:
//一行，一个整数，表示1~2019中共有多少个数包含数字9。
public class ContainNumNine {
    public static void main(String[] args) {
        int count = 0;
        for(int i =1;i<2020;i++)
        {
           if(containNumNine(i))
           {
               count++;
           }
        }
        System.out.println(count);
    }
    public static boolean containNumNine(int num)
    {
        while(num>0)
        {
            int n = num % 10;
            if(n == 9)
            {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
