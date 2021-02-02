/*
    *   copyOf方法的实现
    *   仅实现int类型数组的copyOf方法不再进行重构
    * */
    public static int[] copyOf(int[] arr,int num){
        int[] ret = new int[num];
        if(num <= arr.length) {
            for (int i = 0; i < num; i++)
            {
                ret[i] = arr[i];
            }
        }else{
            for(int i = 0;i<arr.length;i++){
                ret[i] = arr[i];
            }
            for(int i = arr.length;i<num;i++){
                ret[i] = 0;
            }
        }
        return ret;
    };