import java.util.Scanner;

//题目描述
//已知一个函数y=f(x)，当x < 0时，y = 1；当x = 0时，y = 0；当x > 0时，y = -1。
//输入描述:
//一行，输入一个整数x。（-10000<x<10000）
//输出描述:
//一行，输出y的值。
public class CalculationValue {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int x= scanf.nextInt();
        int y;
        if(x<0)
        {
            y = 1;
        }
        else if(x == 0)
        {
            y = 0;
        }
        else{
            y = -1;
        }
        System.out.println(y);
    }
}
