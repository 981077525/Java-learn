// 1. Java的快捷键 shift+F6可以将类名称和文件名称都修改，并将调用该类的名称也进行修改
//方法必须写在类里面
public class HelloWorld {
    public static void main(String[] args) {
        //重新写的一个类，并且调用这个类，'.'就在这里相当于“的”的意思
        //   Add.main();
            Size();
    }

    public static void Size() {

        short a = 1;
        a = Short.MAX_VALUE;
        System.out.print("Short的最大值为：");
        System.out.print(a + "\n");
        System.out.print("Short的最小值为：");
        System.out.print(Short.MIN_VALUE + "\n");

        int b = 1;
        b = Integer.MAX_VALUE;
        System.out.print("Int的最大值为：");
        System.out.print(b + "\n");
        System.out.print("Int的最小值为：");
        System.out.print(Integer.MIN_VALUE + "\n");

        int c = 1;
        c = Integer.MAX_VALUE;
        System.out.print("Long的最大值为：");
        System.out.print(c + "\n");
        System.out.print("Long的最小值为：");
        System.out.print(Long.MIN_VALUE + "\n");
    }
}
