import java.util.Arrays;
public class 使用Arrays类下面的binary方法 {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int[] arr = {0,1,2,3,4,4,5,6,7,8,9,10,11,11,13};
        //使用Arrays下面的binarySearch方法进行数据的查找
        //找7
        System.out.println(Arrays.binarySearch(arr, 7));
        //找4
        System.out.println(Arrays.binarySearch(arr, 4));
        //找15
        System.out.println(Arrays.binarySearch(arr, 15));
    }

}
