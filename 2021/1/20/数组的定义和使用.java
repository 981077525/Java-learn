public class Two_One {
    public static void main(String[] args) {
        //第一种
        int[] arr = {0,1,2,3,4,5,6,7};
        //一：
        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        //二：
        for(int b:arr){
            System.out.println(b);
        }
    }
}
