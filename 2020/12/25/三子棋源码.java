//用户输入的类文件
import java.util.Scanner;
//生成随机数的类文件
import java.util.Random;
//写的的是一个三子棋的小游戏，通过控制台输出输入
public class TicTacToe<row, col> {

//    定义一个int类型的二维数组
//    定义行和列方便后续的修改
    static int row = 3;
    static int col = 3;
//    初始化一个3行3列的整型二维数组
    static char [][] board =new char[row][col];
//    类的主方法

    public static void main(String[] args)
    {
        int inputUser;
        do {
            //调用菜单
            menu();

            //    实现输入的功能
            //创建Scanner对象，接受从控制台输入
            Scanner input=new Scanner(System.in);
            inputUser = input.nextInt();
            if(inputUser == 1)
            {
                initBoard(board,row,col);
                showBoard(board,row,col);
                char ret = '1';
                while (ret == '1')
                {
                    playBoard(board,row,col);
                    ret = isWin(board,row,col);
                    if(ret == 'P')
                    {
                        System.out.println("恭喜你获胜了啊！");
                        break;
                    }
                    else if(ret == 'C')
                    {
                        System.out.println("你连人工智障都玩不赢，看来是废了！");
                        break;
                    }
                    else if(ret == 'Q')
                    {
                        System.out.println("平局了！");
                        break;
                    }
                    showBoard(board,row,col);
                    compterBoard(board,row,col);

                    ret = isWin(board,row,col);
                    if(ret == 'P')
                    {
                        System.out.println("恭喜你获胜了啊！");
                        break;
                    }
                    else if(ret == 'C')
                    {
                        System.out.println("你连人工智障都玩不赢，看来是废了！");
                        break;
                    }
                    else if(ret == 'Q')
                    {
                        System.out.println("平局了！");
                        break;
                    }
                    showBoard(board,row,col);
                }

            }
            if(inputUser == 0)
            {
                System.out.println("您已经成功退出游戏了！");
            }
        }while (inputUser == 1);

    }
//    菜单方法
    public static void menu()
    {
        System.out.println("#########################");
        System.out.println("#######三子棋小游戏########");
        System.out.println("########1.开始游戏########");
        System.out.println("########0.退出游戏########");
        System.out.println("请输入你要执行的指令：");
    }
//   初始化棋盘
    public static void initBoard(char board[][],int row,int col)
    {
        for (int i =0;i<row;i++)
        {
            for(int j = 0; j < col ; j++ )
            {
//                将二维数组的所有值初始化为‘ ’空
                board[i][j] = ' ';
            }

        }
    }
//    展示棋盘
    public static void showBoard(char board[][],int row,int col)
    {
        System.out.println("####################");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col ;j++)
            {
                System.out.printf("|  %c  ",board[i][j]);
            }
            System.out.printf("|\n####################\n");
        }
    }
//    玩家落子
    public static void playBoard(char board[][],int row,int col)
    {
        System.out.println("现在到玩家落子：");
        System.out.println("请输入你要落子的坐标：");

        while(1 == 1)
        {
            //创建Scanner对象，接受从控制台输入
            Scanner input=new Scanner(System.in);
            int inputPlayx = input.nextInt();
            int inputPlayy = input.nextInt();
//            判断坐标是否合法
            if(inputPlayx < row && inputPlayy <col && board[inputPlayx][inputPlayy] == ' ')
            {
                board[inputPlayx][inputPlayy] = 'P';
                break;
            }
            else
            {
                System.out.println("坐标非法，请输入合法坐标：");
            }
        }

    }
//    电脑落子
    public static void compterBoard(char board[][], int row, int col)
    {
        System.out.println("现在到电脑落子：");
        while(1 == 1)
        {
            Random random = new Random();
            int x =  random.nextInt(3);
            int y =  random.nextInt(3);
            random.nextInt(100);
            if(x < row && y <col && board[x][y] == ' ')
            {
                board[x][y] = 'C';
                break;
            }
        }
    }
    //判断是否满子
    public static char IsFull(char board[][], int row, int col)
    {

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if (board[i][j] == ' ')
                {
                    return '1';
                }
            }
        }
        return 'Q';
    }
//    判断胜负
    public static char isWin(char board[][],int row,int col) {
//        判断行赢
        for(int i =0; i<row;i++)
        {
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][2] == 'P')
            {
                return 'P';
            }
            else if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][2] == 'C')
            {
                return 'C';
            }
        }
//        判断列赢
        for(int i =0; i<col;i++)
        {
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[2][i] == 'P')
            {
                return 'P';
            }
            else if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[2][i] == 'C')
            {
                return 'C';
            }
        }
//        判断斜赢
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] == 'P' ||
                board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] == 'P')
        {
            return 'P';
        }
        else if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] == 'C' ||
                board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] == 'C')
        {
            return 'C';
        }
        return IsFull(board,row,col);
    }
}
