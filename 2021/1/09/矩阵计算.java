import java.util.Scanner;

//题目描述
//输入NxM矩阵，矩阵元素均为整数，计算其中大于零的元素之和。
//输入描述:
//第一行为N M(N: 矩阵行数；M: 矩阵列数,且M,N<=10)，接下来的N行为矩阵各行。
//输出描述:
//一行，其中大于零的元素之和。
public class MatrixCalculation {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int n = scanf.nextInt();
        int m = scanf.nextInt();
        int[][] arr = new int[n][m];
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                arr[i][j] = scanf.nextInt();
            }
        }
        for(int i =0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                if(arr[i][j] > 0)
                {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
