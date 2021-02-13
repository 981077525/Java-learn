public class Teacher1 {

    int age;
    String name;

    /*
    *    定义初始化进行代码的初始化
    *
    *    int age = 18;
    *    String name = "张三";
    * 
    * */


    // 通过 构造代码块 初始化
    {
         age = 10;
         name = "张三";
    }
    // 通过 构造方法（构造器）进行初始化
    public Teacher1(int age,String name){
        this.age = age;
        this.name = name;
    }
    
}
