    /*
    *   equals方法的实现
    *   这里仅对int类型的数组进行实现，不在进行重构，重构方法类似
    * */
    public static boolean equals(int[] arr1,int[] arr2){
        if(arr1.length == arr2.length){
            for(int i = 0; i<arr1.length;i++){
                if(arr1[i] == arr2[i]){
                    continue;
                }else{
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    };