import java.util.Arrays;

public class 二维数组练习 {
    public static void main(String[] args) {
        long[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        long[] t = arr[2];
        arr[2] = arr[3];
        arr[3] = t;
        long[] b = arr[2];
        //  上面三行代码，实际上执行了 引用 arr 所指向的对象的第三行和第四行的一个交换
        System.out.println(Arrays.toString(t));     // [9, 10, 11, 12]
        System.out.println(Arrays.toString(b));     // [13, 14, 15, 16]
    }
}
