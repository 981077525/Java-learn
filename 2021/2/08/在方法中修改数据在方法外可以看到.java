import java.util.Arrays;

public class 在方法中修改数据在外可以看到 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        swap(arr,2,3);
        System.out.println(Arrays.toString(arr));
    }
    /*
    *   之所以会发生改变，是因为引用具有 ”共享“ 的特性，通过其中一个引用修改所指向的对象，其余所有指向这个对象的引用都可以看得到
    *
    *   因为方法中国形参不会影响实参，但此处修改的是引用所指向的对象，即修改的是对象，即从方法的外部可以看的到对象的修改
    * */
    public static void swap(int[] arr,int indexA,int indexB) {
        int a = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = a;
    }
}
