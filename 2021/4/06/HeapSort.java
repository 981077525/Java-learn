package Sort;

import java.util.Arrays;

public class HeapSort {


    /*
    *   堆排序：实现思路
    * */

    // 实现堆排序
    // 1. 建立一个大堆，使得最大的值在堆顶
    // 循环此处：
    //      循环开始
    // 2. 将堆顶元素和数组中的最后一个元素交换
    // 3. 重新维护堆，使其仍然满足堆顶元素为最大值
    //      循环结束
    // 当堆中只剩下一个元素的时候，此时该值为数组中的最小值，即可退出循环

    /*
    *   业务逻辑
    * */

    public static void heapSort(long[] array){

        // 建一个大堆
        buildBigHeap(array);


        for(int i = 0;i<array.length - 1;i++){
            // 将堆顶元素和数组的左后一个元素交换
            swap(array,0,array.length - 1 - i);

            // 向下维护这个堆
            adjustDown(array,array.length - i - 1,0);
        }
    }
    /*
    *   建立一个大堆，堆中元素为 array 中的元素
    * */
    private static void buildBigHeap(long[] array){
        for(int i = (array.length - 2) / 2 ; i>= 0;i--){
            adjustDown(array,array.length,i);
        }
    }
    /*
    *
    * */
    private static void adjustDown(long[] array, int size, int index) {
        while(true){
            int leftIndex = (index * 2) + 1;
            if(leftIndex >= size){
                return;
            }

            int rightIndex = (index * 2) + 2;
            int maxIndex = leftIndex;

            if(rightIndex < size && array[rightIndex] > array[leftIndex]){
                maxIndex = rightIndex;
            }

            if(array[index] >= array[maxIndex]){
                return;
            }

            swap(array,index,maxIndex);

            index = maxIndex;
        }
    }

    /*
    *   交换数组中下标为 i 和 j 的两个数
    * */
    private static void swap(long[] array,int i ,int j ){
        long tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        long[] arr = {9,5,6,3,4,2,1};

        System.out.println(Arrays.toString(arr));

        heapSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
