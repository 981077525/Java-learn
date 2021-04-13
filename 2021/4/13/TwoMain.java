package day03_4_13;

import java.util.*;

public class TwoMain {
    public static int MoreThanHalfNum_Solution(int[] array) {
        Map<Integer,Integer> map = new TreeMap<>();

        for(int i = 0; i<array.length;i++){
            int numcount = map.getOrDefault(array[i],0);
            map.put(array[i],numcount + 1);
        }


        Set<Integer> set = map.keySet();
        int[] arr = SetToInt(set);

         for (int i = 0;i<arr.length;i++){
             if(map.get(arr[i]) > (array.length / 2.0)){
                return arr[i];
            }
        }
         return 0;
    }
    // 将set集合转为整型int数组的方法
    private static int[] SetToInt(Set<Integer> allSet) {
        // 先将set集合转为Integer型数组
        Integer[] temp = allSet.toArray(new Integer[] {});//关键语句

        // 再将Integer型数组转为int型数组
        int[] intArray = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            intArray[i] = temp[i].intValue();
        }
        return intArray;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(arr));
    }
}
