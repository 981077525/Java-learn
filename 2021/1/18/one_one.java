//如果 int x=20, y=5 ，则语句 System.out.println(x+y +""+(x+y)+y);  的输出结果是（ ）
//A: 2530 B: 55 C: 2052055 D: 25255

//选择d 实际效果 25255
public class one_one {
    public static void main(String[] args) {
        int x=20, y=5 ;
        //此处存在一个类型的转换，因为其中穿插了个字符“”，当运行到此时的值类型更改为String
        System.out.println(x+y +""+(x+y)+y);
    }
}
