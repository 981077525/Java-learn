    /*
    *   sort方法的实现
    *   这里仅对int类型的数组进行实现
    * */
    public static void sort(int[] arr){
        int max = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i + 1;j<arr.length;j++)
            if(arr[i] > arr[j]){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    };