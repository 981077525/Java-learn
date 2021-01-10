import java.util.Scanner;

//题目描述
//小乐乐获得4个最大数，请帮他编程找到最大的数。
//输入描述:
//一行，4个整数，用空格分开。
//输出描述:
//一行，一个整数，为输入的4个整数中最大的整数。
public class FourNumberMax {
    public static void main(String[] args) {
        Scanner scnaf = new Scanner(System.in);
        while(scnaf.hasNextInt())
        {
            int a = scnaf.nextInt();
            int b = scnaf.nextInt();
            int c = scnaf.nextInt();
            int d = scnaf.nextInt();
            System.out.println(max(max(a,b),max(c,d)));
        }
    }
    public static int max(int a,int b){
        if(a> b)
        {
            return a;
        }
        else{
            return b;
        }
    }
}
