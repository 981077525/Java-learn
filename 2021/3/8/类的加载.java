public class 类的加载 {
    // 类的加载机制：
    // 一个类 Hello.java

    // Hello.java --> Hello.class --> JVM读取到内存中


    public static void main(String[] args) {
        // 什么情况下类才会加载：
        // 一 ：类被调用时；
        //      类中的属性和方法被调用时。
        Hello.echo();
        // 二 ：类被用来实例化对象时；
        Hello a = new Hello(18,"云米");
        System.out.println(a.age);
        System.out.println(a.name);
        a.printString();
    }

}
