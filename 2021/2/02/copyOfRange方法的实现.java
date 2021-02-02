    /*
    *   copyOfRange方法进行实现
    *   复制指定的索引下标数组
    * */
    public static int[] copyOfRange(int[] arr,int fromIndex,int toIndex){
        //输出报错信息
        if(fromIndex > toIndex || fromIndex < 0 || toIndex >arr.length - 1){
            throw new RuntimeException("您输入的参数有误，请检查核对后再进行输入！");
        }
        //业务逻辑开始执行
        int[] ret = new int[toIndex - fromIndex];
        int i = fromIndex;
        int j = 0;
        while(i<toIndex){
            if (j < toIndex - fromIndex) {
                ret[j] = arr[i];
            }else{
                break;
            }
            i++;
            j++;
        }

        return ret;
    };