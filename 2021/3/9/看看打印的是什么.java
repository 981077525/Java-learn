// 在一个类文件中可以有多个类，可以由多个class，但是只能有一个public类，类名不能重复
// public 的类名得和文件名相同
// 一个文件中可以有多个 class，但只能有一个 public class
// 并且 public class 的名称 == 文件名
// 其他类的名字不能重复

class 执行顺序 {
    public static int a = initStatic();

    {
        System.out.println("A");
    }

    public 执行顺序() {
        this("Hello");
        System.out.println("B");
    }

    public 执行顺序(String s) {
        System.out.println("C");
    }

    public int b = init();

    public static int initStatic() {
        System.out.println("D");
        return 0;
    }

    public int init() {
        System.out.println("E");
        return 0;
    }

    static {
        System.out.println("F");
    }
}

/*
*   执行顺序：
*       一 ：先进行静态初始化
*           ① ： 静态属性的定义时初始化
*           ② ： 静态的代码块的初始化
*       二 ：进行非静态初始化
*           其他代码的加载
* */
public class 看看打印的是什么 {
    public static void main(String[] args) {
        System.out.println("1");
        new 执行顺序();
        System.out.println("2");
        new 执行顺序();
        System.out.println("3");
    }
}

/*
*   根据以上规则，打印出来的结果为： 1 D F A E C B 2 A E C B 3
*
*   类的加载只会出现一次，则静态代码只会加载一次
* */