public class Stu {
//    对于 对象中的 toString() 方法的继承和重写

    String name;
    int age;

    // 构造器
    public Stu(String name,int age){
        this.name = name;
        this.age = age;
    }

    // 此为对Object中toString() 方法的重写
    public String toString(){
        String ret = "" ;
        ret = "name:" + name;
        ret += "age:" + age;
        return ret;

    }


}
