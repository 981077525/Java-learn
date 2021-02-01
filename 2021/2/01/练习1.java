public class 练习1 {
    /*
     *    fromIndexOf方法：在数组arr中从给定的下标从fromIndex开始到toIndex查找变量num
     *                   如果找到了：返回下标
     *                   没找到：返回-1
     *                   如果给定的数组查找范围不合法，则输出报错信息
     *
     * */
    public static int fromIndexOf(int[] arr, int fromIndex, int toIndex, int num) {
        if (fromIndex < 0 || toIndex > arr.length || fromIndex > toIndex) {
            throw new RuntimeException("输入的参数不合法");
        }

        for (int i = fromIndex; i < toIndex; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

}
