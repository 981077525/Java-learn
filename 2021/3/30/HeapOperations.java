package Heap;

import java.util.Arrays;

public class HeapOperations {

    /*
     *   堆化
     *
     * */
    public static void heapify(long[] array, int size, int index) {
        while (true) {
            int leftIndex = 2 * index + 1;
            if (leftIndex >= size) {
                return;
            }

            int minIndex = leftIndex;
            int rightIndex = leftIndex + 1;
            if (rightIndex < size && array[rightIndex] < array[leftIndex]) {
                minIndex = rightIndex;
            }

            if (array[index] <= array[minIndex]) {
                return;
            }

            long t = array[index];
            array[index] = array[minIndex];
            array[minIndex] = t;

            index = minIndex;
        }
    }
    /*
     *   建堆
     * */
    public static void createHeap(long[] array, int size) {
        int lastChildIndex = size - 1;
        int lastParentIndex = (lastChildIndex - 1) / 2;

        for (int i = lastParentIndex; i >= 0; i--) {
            heapify(array, size, i);
        }
    }

    public static void main(String[] args) {
//        long[] array = { 100, 3, 50, 4, 7, 60, 70, 8, 9, 12, 13, 65, 66, -1, -1, -1, -3 };
//        int size = 13;
//
//        heapify(array, size, 0);
//
//        System.out.println(Arrays.toString(array));

        long[] array = { 3, 5, 2, 7, 6, 8, 9, 4, 1, 0, 3, 9, 3, -1, 3 };
        int size = 13;

        createHeap(array, size);

        System.out.println(Arrays.toString(array));
    }
}
