//定义一个方法。从一个数组中，找打第一次遇到的给定元素，如果找到，返回其下标，如果找不到则返回-1
public class NumberArreryCodeText {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(indexOf(arr,6));
    }
    public static int indexOf(int[] arr,int num){
        for (int i = 0;i<arr.length;i++) {
            if(num == arr[i])
            {
                return i;
            }
        }
        return -1;
    }
}
