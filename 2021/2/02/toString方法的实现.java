    /*
    *   toString方法的实现
    *   这里仅对int类型的数组进行实现，不进行重构
    * */
    public static String toString(int[] arr){
        String ret = "[";
        for(int i = 0; i<arr.length - 1;i++){
            ret += arr[i] + ", ";
        }
        ret+= arr[arr.length - 1] + "]";
        return ret;
    };