import java.util.Scanner;

//题目描述
//2020年来到了，KiKi要对他的n位好朋友说n遍”Happy new year!Good luck!”的祝福语。
//输入描述:
//输入只有一行，其中含有一个正整数 n(1≤n≤20)，代表KiKi说祝福话的遍数。
//输出描述:
//输出 n行"Happy new year!Good luck!"。
public class HappyNewYear {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int n = scanf.nextInt();
        for(int i =0;i<n;i++)
        {
            System.out.println("Happy new year!Good luck!");
        }
    }
}

