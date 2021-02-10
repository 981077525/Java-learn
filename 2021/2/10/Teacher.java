import java.util.Arrays;

public class Teacher {
    public String name;
    public int age;
    public String[] courseArrays;

    // 构造器的重载

    // 无参数列表的构造器
    public Teacher(){
        this(null,0,null);
    }

    // 含有 name 的参数构造器
    public Teacher(String name){
        this(name,0,null);

    }

    // 含有  name 和 age 的参数列表的构造器
    public Teacher(String name,int age){
        this(name,age,null);
    }

    // 含有 name 和 age 和 courseArrays
    public Teacher(String name,int age,String[] courseArrays){
        this.name = name;
        this.age = age;
        this.courseArrays = courseArrays;
    }
}
