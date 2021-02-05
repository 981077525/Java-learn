public class 观察引用和对象 {
    public static void main(String[] args) {
        // 定义一个类型为 long[][] 的数组
        long[][] arr = new long[5][];
        // 引用类型的变量如果没有赋值，则其对应的值为默认值，null
        // 即代表 long[0] == null  ==> true

        // a 代表的是arr数组中的一个元素，其元素的类型为long[] 引用类型的默认值为null
        long[] a = arr[0];
        System.out.println(a == null);
        //此时来查看一下 a 的元素
        long b = a[0];
        System.out.println(b); // 此处即会出现报错，为指向为空异常，即指向的对象为空，无法解引用。
    }
}
