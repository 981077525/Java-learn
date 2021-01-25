//将给定数据填充至给定数组的给定位置
public class NumberArrayValueFill {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        valueFill(arr,3,1);
        for(int b :arr){
            System.out.println(b);
        }
    }
    public static void valueFill(int[] arr,int num,int target){
        arr[target-1] = num;
    }
}
