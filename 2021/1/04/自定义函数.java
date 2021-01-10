import java.util.Scanner;

//题目描述
//小乐乐学会了自定义函数，BoBo老师给他出了个问题，根据以下公式计算m的值。
//其中 max3函数为计算三个数的最大值，如： max3(1, 2, 3) 返回结果为3。
//输入描述:
//一行，输入三个整数，用空格隔开，分别表示a, b, c。
//输出描述:
//一行，一个浮点数，小数点保留2位，为计算后m的值。
public class CustomFunc {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        double a = scanf.nextDouble();
        double b = scanf.nextDouble();
        double c = scanf.nextDouble();
        System.out.println(mFunc(a,b,c));
    }
    public static double mFunc(double a,double b,double c)
    {
        double m = max3(a+b,b,c) / (max3(a,b+c,c) + max3(a,b,b+c));
        return m;
    }
    public static double max3(double a,double b,double c)
    {
        double max = max(max(a,b),c);
        return max;
    }
    public static double max(double a,double b)
    {
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }
    }
}
