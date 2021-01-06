//题目描述
//KiKi想知道这学期他的学习情况，BoBo老师告诉他这学期挂的科目累计的学分，根据所挂学分，判断KiKi学习情况，
// 10分以上：很危险(Danger++)，4~9分：危险(Danger)，0~3:Good。
//输入描述:
//一行，一个整数（0~30），表示KiKi挂的科目累计的学分。
//输出描述:
//一行，根据输入的挂科学分，输出相应学习情况（Danger++，Danger，Good）。
import java.util.Scanner;

public class DangerousFail {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int credit = scanf.nextInt();
        if(credit >= 10)
        {
            System.out.println("Danger++");
        }
        else if(credit >= 4 && credit <=9)
        {
            System.out.println("Danger");
        }
        else if(credit<=3 && credit>=0)
        {
            System.out.println("Good");
        }
    }
}
