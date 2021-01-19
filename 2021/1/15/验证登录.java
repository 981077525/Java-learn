import java.util.Scanner;

//题目描述
//有个软件系统登录的用户名和密码为（用户名：admin，密码：admin），用户输入用户名和密码，判断是否登录成功。
//输入描述:
//多组测试数据，每行有两个用空格分开的字符串，第一个为用户名，第二个位密码。
//输出描述:
//针对每组输入测试数据，输出为一行，一个字符串（“Login Success!”或“Login Fail!”）。
public class Main {
    public static void main(String[] args) {
        Scanner scanf =new Scanner(System.in);
        while(scanf.hasNext())
        {
            String username = scanf.findInLine(" ");
            String password = scanf.findInLine("");
            if(username == "admin" && password == "admin")
            {
                System.out.println("Login Success!");
            }else{
                System.out.println("Login Fail!");
            }
        }
    }
}
