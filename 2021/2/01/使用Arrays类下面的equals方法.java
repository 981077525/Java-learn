import java.util.Arrays;
public class 使用Arrays类下面的equals方法 {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {1,2,3,4,5,6,7};
        int[] arr3 = {1,2,3,4,5,6,7};
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr2, arr3));

    }
//
//    public static boolean equals(boolean[] a,boolean[] a2)
//    如果两个指定的布尔数组彼此相等 ，则返回true 。
//    如果两个数组都包含相同数量的元素，则两个数组被认为是相等的，并且两个数组中所有对应的元素对都相等。
//    换句话说，如果两个数组以相同的顺序包含相同的元素，则它们是相等的。
//    另外，如果两者都是null ，则两个数组引用被认为是相等的 。
//
//    参数
//    a - 要测试相等的一个数组
//    a2 - 要测试的其他数组是否相等
//            结果
//    true如果两个数组相等
}
