public class 打印二维数组 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20}
        };
//        System.out.println(arr.length);
        printArrays(arr);
    }

    /*
    *   printArrays : 可以输出二维数组
    * */
    public static void printArrays(int[][] arr)
    {
        for(int i = 0;i<arr.length;i++){
            String ans = "[";
            for(int j = 0;j<arr[i].length - 1;j++){
                ans += arr[i][j] + ", ";
            }
            ans += arr[i][arr[i].length - 1] +"]";
            System.out.println(ans);
        }
    }
}
