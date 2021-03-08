public class Hello {


    // 静态方法
    public static void echo(){
        System.out.println("调用方法");
    }


    // 需要构造方法的两个属性
    public int age;
    public String name;

    // 构造方法
    public Hello(int age,String name){
        this.age = age;
        this.name = name;
    }

    public void printString(){
        System.out.println("我的名字：" + name + ",我的年龄：" + age+"。");
    }
}
