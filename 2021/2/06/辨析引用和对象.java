import java.util.Arrays;

public class 辨析引用和对象 {
    public static void main(String[] args) {
        long[] a = {1, 2, 3, 4, 5};
        long[] b = a;
        System.out.println(a == b);         // true
        /*
        *   此处输出的值为 true
        *       其a 和 b 指向的是同一个对象
        *       a 引用指向的是一个值为 {1, 2, 3, 4, 5} 的long[] 类型的数组
        *       b 引用指向的是 引用 a 指向的对象
        *       本质上，指向的都是同一个对象
        * */


        long[] a1 = {1,2,3,4,5};
        long[] b1 = Arrays.copyOf(a1,a1.length);
        System.out.println(a1 == b1);       // false
        /*
        *   此处输出的值为 false
        *       其 a1 和 b1 指向的并非同一个对象
        *       a1 引用指向的是一个值为 {1, 2, 3, 4, 5} 的long[] 类型的数组
        *       b1 引用也指向的是一个值为 {1, 2, 3, 4, 5} 的long[] 类型的数组
        *       其对象的值相等，但并不是同一个对象，所以就返回 false 
         * */

    }

}
