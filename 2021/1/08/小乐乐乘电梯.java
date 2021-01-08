import java.util.Scanner;

//题目描述
//小乐乐学校教学楼的电梯前排了很多人，他的前面有n个人在等电梯。电梯每次可以乘坐12人，
//每次上下需要的时间为4分钟（上需要2分钟，下需要2分钟）。请帮助小乐乐计算还需要多少分钟才能乘电梯到达楼上。（假设最初电梯在1层）
//输入描述:
//输入包含一个整数n (0 ≤ n ≤ 109)
//输出描述:
//输出一个整数，即小乐乐到达楼上需要的时间。
public class RowElevator {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int n = scanf.nextInt();
        int time = ((n / 12) * 4) + 2;
        System.out.println(time);
    }
}
