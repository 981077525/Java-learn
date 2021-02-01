public class 练习1 {
    /*
        indexOf方法：在数组arr中进行检查是否含有变量num，如果含有，则返回其下标如果不存在则返回-1
    */
    public static int indexOf(int[] arr,int num){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }


}
