import java.util.Arrays;

/*
 *
 *       引用和对象
 *
 *
 *       引用可以不指向对象，但如若指向，只能同时指向一个对象，可以指向Null
 *
 *       对象可以被多个引用指向
 *
 *       引用之间不存在  > 或者 < 只存在 == 和 !=
 *
 *       1. == 等于
 *              当两个引用同时指向同一个对象，或者都指向Null时为True
 *       2. != 不等于
 *              当两个引用不同指向同一个对象，或者仅其中一个指向Null时为True
 *
 *  */
public class ReferenceAndObject {
    public static void main(String[] args) {
        // 新定义的引用
        // 具体的引用说明为：
        // 引用名为 array 其指向一个对象，该对象为一个类型为long[]的对象，值为 {1, 2, 3, 4, 5, 6}
        long[] array = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(array));

        // 定义引用名为  array2  的引用，其指向array指向的对象
        long[] array2 = array;

        System.out.println(Arrays.toString(array2));

        // 对象的解引用
        long a = array[1];
        System.out.println(a);
        array[1] = 100;
        System.out.println(array[1]);

        // java中数据类型的引用
        long[] a1 = {1,2,3,4,5};
        long[] a2 = {1,2,3,4,5};

        //直接将其进行比较：

        // 虽然其指向的对象的值相等，但其并未指向同一个对象，其仍不相等
        System.out.println(a1 == a2);               //  false
        // 此时对于不同的对象，判断值是否相等，使用Arrays类下的equals方法进行比较
        System.out.println(Arrays.equals(a1,a2));   //  true
    }
}
