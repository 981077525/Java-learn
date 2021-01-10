import java.util.Scanner;

//题目描述
//判断一个整数是否能5整除是一个挺简单的问题，懒惰的KiKi还是不想自己做，于是找到你帮他写代码，你就帮帮他吧。
//输入描述:
//输入包括一个整数M（1≤M≤100,000）。
//输出描述:
//输出包括一行，如果M可以被5整除就输出YES，否则输出NO（结果大小写敏感）。
public class DivisibleNumFive {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int m = scanf.nextInt();
        if(m%5 == 0)
        {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
