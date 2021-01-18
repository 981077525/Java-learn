//给定以下方法声明，调用执行 mystery（1234） 的输出结果？( )
//precondition: x >=0
// public void mystery (int x) {
//      System.out.print(x % 10);
//      if ((x / 10) != 0){
//      mystery(x / 10);
//      }
//      System.out.print(x % 10);
//      }
//A: 1441 B: 43211234 C: 3443 D: 12344321

//答案：B
public class one_three {
    public static void main(String[] args) {
        mystery(1234);
    }
    //precondition: x >=0
    public static void mystery(int x) {
        System.out.print(x % 10);
        if ((x / 10) != 0){
            mystery(x / 10);
        }
        System.out.print(x % 10);
    }

}
