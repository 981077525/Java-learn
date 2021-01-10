import java.util.Scanner;

//题目描述
// 小乐乐的班主任想统计一下班级里一共有多少人需要被请家长，三个成绩（语文，数学，外语）平均分低于60的将被请家长，
// 小乐乐想编程帮助班主任算一下有多少同学被叫家长。
//输入描述:
//共n+1行
//第一行，输入一个数n，代表小乐乐的班级中有n个同学。
//在接下来的n行中每行输入三个整数代表班级中一个同学的三科成绩（语文，数学，外语），用空格分隔。
//输出描述:
//一行，一个整数，代表班级中需要被请家长的人数。
public class CallParentsNumber {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
            int count = 0;
            int num = scanf.nextInt();
            for(int i =0;i<num;i++)
            {
                int chinese = scanf.nextInt();
                int math = scanf.nextInt();
                int english = scanf.nextInt();
                if(isQualified(chinese,math,english) == false)
                {
                    count++;
                }
            }
            System.out.println(count);
    }
    public static boolean  isQualified(double a,double b,double c)
    {
        if ((a + b +c ) / 3 < 60)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
