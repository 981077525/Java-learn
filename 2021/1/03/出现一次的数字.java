//作业标题
//找出出现一次的数字
//作业内容
//有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
public class SearchNumber {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,3,4,4,5,5,6,6};
        System.out.println(searchNumber(a));
    }
    public static int searchNumber(int[] a)
    {
        int num = a[0];
        for(int i =1; i<a.length;i++)
        {
            num ^= a[i];
        }
        return num;
    }
}
