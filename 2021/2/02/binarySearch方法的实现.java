 /*
    *   binarySearch方法的实现
    *   二分查找
    *   找到就返回下标，没找到就返回 -1；
    * */
    public static int binarySearch(int[] arr, int num){
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2 ;
        while(left<right){
            if(arr[mid] < num){
                left = mid;
            }else if(arr[mid] > num){
                right = mid;
            }else{
                return mid;
            }
            mid = (left + right) / 2 ;
            if(left == right - 1){
                if(arr[left] == num){
                    return left;
                }else if(arr[right] == num){
                    return right;
                } else{
                    break;
                }
            }
        }
        return -1;
    };