import java.util.Arrays;

public class 使用Arrays类下面的copyOf方法 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = Arrays.copyOf(arr,3);
        for(int i = 0;i<arr2.length;i++){
            System.out.print(arr2[i]);
        }
    }

    /*
    *   Arrays类下面的copyof方法
    *       function:
    *                 将数组arr进行截断或者填充，多出来的数据进行丢弃，不足的数据使用0进行填充。最终过的数组的长度为n，并且作为最后的返回值。
    *   public static type[] copyOf(type[] arr,int n){};
    * */

}
