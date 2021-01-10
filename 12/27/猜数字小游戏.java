import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static Scanner scanf = new Scanner(System.in);
    static Random  random  = new Random();
    //主体函数
    public static void main(String[] args)
    {
        int a;
        do {
            a = menu();
            if (a == 1)
            {
                int b = diffcult();
                game(b);
            }

        }while(a == 0);
    }
    //菜单函数menu
    public static int menu()
    {
        System.out.println("###################");
        System.out.println("#####猜数字小游戏####");
        System.out.println("#####1.开始游戏#####");
        System.out.println("#####0.退出游戏#####");
        System.out.println("###################");
        int userInput  = scanf.nextInt();
        return userInput;
    }
    //    难度菜单
    public static int diffcult()
    {
        System.out.println("###################");
        System.out.println("######难度选择######");
        System.out.println("######1.简单#######");
        System.out.println("######2.容易#######");
        System.out.println("######3.困难#######");
        int userInput = scanf.nextInt();
        int count;
        switch (userInput)
        {
            case 1:
                count = 20;
                break;
            case 2:
                count = 10;
                break;
            case 3:
                count = 5;
                break;
            default:
                count = 10;
        }
        System.out.println("您一共有" + count +"次机会：");
        return count;
    }
    public static void game(int count)
    {
        int r = random.nextInt(100);
        while(scanf.hasNextInt()){
            if (count == 1)
            {
                System.out.println("您的次数已用尽，游戏结束！");
                break;
            }
            //用户输入猜的数字
            int userNumber = scanf.nextInt();
            //
            if(userNumber == r)
            {
                System.out.println("恭喜你：您猜对了");
                break;
            }
            else if(userNumber > r)
            {
                System.out.println("猜大了！请重新输入：");
                count --;
            }
            else if(userNumber < r)
            {
                System.out.println("猜小了！请重新输入：");
                count --;
            }
        }
    }
}
