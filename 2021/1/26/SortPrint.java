import java.util.Scanner;

//题目：输入三个整数x,y,z，请把这三个数由小到大输出
public class paixu {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int x = scanf.nextInt();
        int y = scanf.nextInt();
        int z = scanf.nextInt();
        minSort(x,y,z);
    }
    public static void minSort(int a,int b, int c){
        if(a>b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        if(a>c){
            int tmp = a;
            a = c;
            c = tmp;
        }
        if(b>c){
            int tmp = b;
            b= c;
            c =tmp;
        }
        System.out.printf("%d %d %d",a,b,c);
    }
}
