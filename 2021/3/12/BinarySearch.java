class Range{
    private int[] arr;

    private int lowIndex;
    private int hightIndex;

    private int middleIndex;
    private int middleValue;
    public Range(int[] arr){
        this.arr = arr;
        this.lowIndex = 0;
        this.hightIndex = arr.length - 1;
        this.middleIndex = (hightIndex + lowIndex) / 2;
        this.middleValue = arr[middleIndex];
    }

    // 获取对象长度或者元素的个数
    public int getSize(){
        return hightIndex - lowIndex;
    }
    // 获取元素中间元素的下标
    public int getMiddleIndex(){
        return middleIndex;
    }
    // 获取对象中间元素的值
    public int getMiddleValue(){
        return middleValue;
    }
    // 丢弃左半部分的数组
    public void discardLeftPart(){
        lowIndex = middleIndex;
        middleIndex = ((hightIndex + lowIndex + 1) / 2);
        middleValue = arr[middleIndex];
    }
    // 丢弃右半部分的数组
    public void discardRightPart(){
        hightIndex = middleIndex;
        middleIndex = ((hightIndex + lowIndex - 1) / 2) ;
        middleValue = arr[middleIndex];
    }
}
/*
*   使用面向对象的思想实现二分查找
* */
public class BinarySearch{
    public static int binarySearch(int[] arr, int target) {
        // 实例化这个对象
        Range range = new Range(arr);

        while(range.getSize() > 0 ){
            if(range.getMiddleValue() == target){
                return range.getMiddleIndex();
            }else if(range.getMiddleValue() < target){
                range.discardLeftPart();
            }else{
                range.discardRightPart();
            }
        }
        // 返回 -1 即为没有找到
        return -1;
    }
}