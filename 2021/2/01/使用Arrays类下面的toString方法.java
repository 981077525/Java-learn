import java.util.Arrays;

public class 使用Arrays类下面的toString方法 {
    public static void main(String[] args) {
        TesttoString();
    }

    private static void TesttoString() {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        long[] arr2 = {981077525,45402452,1245738423,1113022,1931011219};
        String[] str = {"123456789","Hello", "Word"};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(str)+ "123");
    }

//    public static String toString(type[] a)
//    返回指定数组的内容的字符串表示形式。 字符串表示由数组元素的列表组成，括在方括号（ "[]" ）中。 相邻的元素由字符", "分隔（逗号后跟一个空格）。
//    元素将转换为字符串，如String.valueOf(boolean) 。 返回"null"如果a是null。
//    参数
//    a - 要返回的字符串表示形式的数组
//            结果
//    一个字符串表示形式为 a

}
