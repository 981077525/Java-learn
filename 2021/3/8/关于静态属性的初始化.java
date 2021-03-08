public class 关于静态属性的初始化 {

    // 按照代码的执行顺序进行执行

    // 1. 定义时初始化
    public static int age = 10;
    public static String title = init();

    public static String init(){
        return ("这里是定义时初始化！");
    }
    // 2. 静态代码块

    static {
        System.out.println("这里是静态代码块执行！");
    }

    // 按照书写顺序进行执行
}
