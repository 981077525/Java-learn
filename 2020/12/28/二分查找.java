import java.util.Scanner;

public class TwoSearch {
    public static void main(String[] args) {
        //二分查找
        int[] arr = {1,2,3,4,5,6,7,8,9,10,12,15,16};
        Scanner scanf = new Scanner(System.in);
        while (scanf.hasNextInt())
        {
            int num = scanf.nextInt();
            int ret = twoSearch(arr,num);
            System.out.print("你要查询的数组为：");
            for (int i = 0;i<arr.length;i++)
            {
                System.out.print("  " + arr[i]+ "  ");
            }
            System.out.println();
            if(ret == -1)
            {
                System.out.println("该数组中没有您要找的数！");
            }
            else {
                System.out.println("你要找的数是：" + num);
                System.out.println("他的下标为：" + ret);
            }
        }
    }
    public static int twoSearch(int[] arr,int num)
    {
        //返回的是数组的下标值，返回找到数的下标，如未找到返回-1；
        int left = 0;
        int right = arr.length - 1;
        int mid;
        if(arr.length % 2 == 0)
        {
            mid = (left + right ) / 2;
            //当仅剩下一个数的时候仍然需要判断
            while(left <=right) {
                if (arr[mid] > num) {
                    right = mid;
                    mid = ( left + right + 1) / 2;
                } else if (arr[mid] == num) {
                    return mid;
                } else {
                    left = mid;
                    mid = (left + right + 1) / 2;
                }
            }
        }
        else
        {
            mid = (left + right) / 2;
            while(left <= right) {
                if (arr[mid] > num) {
                    right = mid - 1;
                    mid = ( left + right + 1) / 2;
                } else if (arr[mid] == num) {
                    return mid;
                } else {
                    left = mid + 1;
                    mid = (left + right + 1) / 2;
                }
            }
        }
        return -1;
    }
}
