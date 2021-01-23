

import java.util.Scanner;

//题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
//
public class 古典问题 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("请输入你要判断的月份：");
        int n = scanf.nextInt();
        int num = power(n);
        System.out.println("这个月的兔子对数为：" + num);
    }
    public static int power(int n){
        if(n <3)
        {
            return 1;
        }else{
            return power(n-1) + power(n-2);
        }
    }
}
