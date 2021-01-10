import java.util.Scanner;

//题目描述
//小乐乐的老师BoBo想知道班级中谁的数学成绩最高，请编程帮他实现。
//输入描述:
//共n+1行
//第一行输入一个数n，代表小乐乐的班级中n个同学。
//第二行输入n个数，用空格相隔，代表班级中每个人的数学成绩。
//输出描述:
//一个整数，代表班级中最高的数学成绩。
public class MaxAchevement {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int maxnum = 0;
        int num = scanf.nextInt();
        for(int i =0;i<num;i++)
        {
            int achievement = scanf.nextInt();
            maxnum = max(maxnum,achievement);
        }
        System.out.println(maxnum);
    }
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
}
