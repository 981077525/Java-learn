//作业标题
//求最大值方法的重载
//作业内容
//在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
public class FuncHeavyLoad {
    public static void main(String[] args) {
        System.out.println(max(1.857,3.0122));
    }
    //求两个整数的最大值
    public static int max(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }
    }
    //求两个小数的最大值
    public static double max(double a, double b)
    {
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }
    }
    //求一个小数和一个整数的关系
    public static double max(double a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }
    }
    //求一个整数和一个小数的关系
    public static double max(int a ,double b)
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
