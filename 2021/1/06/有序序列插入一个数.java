import java.util.Scanner;

//题目描述
//有一个有序数字序列，从小到大排序，将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。
//输入描述:
//第一行输入一个整数(0≤N≤50)。
//第二行输入N个升序排列的整数，输入用空格分隔的N个整数。
//第三行输入想要进行插入的一个整数。
//输出描述:
//输出为一行，N+1个有序排列的整数。
public class InsertNumber {
    public static void main(String[] args) {
        Scanner scanf =new Scanner(System.in);
        int num = scanf.nextInt();
        int[] arr = new int[num];
        for(int i =0;i<num;i++)
        {
            arr[i] = scanf.nextInt();
        }
        int insertnum = scanf.nextInt();
        int[] arr2 = new int[num+1];
        for(int i = 0;i<num;i++)
        {
            arr2[i] = arr[i];
        }
        arr2[num] = insertnum;
        arr2 = bubblingSort(arr2);
        for(int i = 0;i<num+1;i++)
        {
            System.out.printf("%d ",arr2[i]);
        }
    }
    public static int[] bubblingSort(int[] arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            for(int j = i +1;j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
