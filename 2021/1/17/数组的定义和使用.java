/*

      数组的定义：
                DataType[] name = new DataType[int];
                数组的类型和其对应的数组维数

 */

public class Array{
    public static void main(String[] args)
    {
        //定义一个元素个数为5的整型数组，不进行赋值初始化
        int[] arr = new int[5];

        //定义一个元素个数为4的整型数组，进行初始化
        int[] arr1 = new int[]{0, 1, 2, 3};
        //遍历的第一种方法：
        for(int i =0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        //遍历的第二种方法：
        for(int b: arr1)
        {
            System.out.println(b);
        }
    }
}