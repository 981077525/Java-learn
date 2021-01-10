import java.util.Scanner;
//题目描述
//小乐乐输入百分制成绩，他想将成绩转换成等级制。
// 转换规则为：90-100为’A’，80-89为’B’，70-79为’C’，60-69为’D’，59以下为’E’。如果输入的成绩不在0-100之间，输出’F’。
//输入描述:
//一行，一个整数表示的成绩。
//输出描述:
//一行，转换后的等级。
public class TransformationAchievement {
    public static void main(String[] args) {
        Scanner  scanf = new Scanner(System.in);
        while(scanf.hasNextInt())
        {
            int a = scanf.nextInt();
            System.out.println(transformationAchievement(a));
        }
    }
    public static char transformationAchievement(int n)
    {
        if(n<=100 && n>=90)
        {
            return 'A';
        }
        else if(n<=89 && n>=80)
        {
            return 'B';
        }
        else if(n<=79 && n>=70)
        {
            return 'C';
        }
        else if(n<=69 && n>=60)
        {
            return 'D';
        }
        else if(n>=0 && n<=59)
        {
            return 'E';
        }
        else
        {
            return 'F';
        }
    }
}
