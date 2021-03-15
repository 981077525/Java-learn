/*
 *   在一个m * n 的二维数组中查找是否有数 target
 *           如果有 则返回 true
 *           没有则返回false
 * */

public class TwoArrrayBinarySearch {
    public static boolean twoArrayBinarySearch(int[][] arr, int target) {


        for (int i = 0; i<arr.length - 1;i++) {
            if(BinarySearch.binarySearch(arr[i],target) != (-1) ){
                return true;
            }
        }
        return false;
    }
}
