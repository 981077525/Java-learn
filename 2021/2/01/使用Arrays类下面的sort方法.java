import java.util.Arrays;

public class 使用Arrays类下面的sort方法 {
    public static void main(String[] args) {
        testsort();
    }

    private static void testsort() {
        int[] arr = {3, 5, 2, 1, 6, 9, 8, 1, 2, 6, 5, 4, 2, 3, 6, 1};
        int[] arr2 = {3, 5, 2, 1, 6, 9, 8, 1, 2, 6, 5, 4, 2, 3, 6, 1};
        //整体进行排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //对数组从下标为fromIndex(5) -- toIndex(9) 进行排序
        Arrays.sort(arr2, 5, 9);
        System.out.println(Arrays.toString(arr2));
    }
}
