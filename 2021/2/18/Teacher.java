public class Teacher {
    // Teacher类中的两种用法

    /*
    *   作为构建对象的模板，使用方法时通过生成的对象进行调用
    * */
    public String name; // 姓名
    public int age;     // 年龄

    public Teacher(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return ("姓名：" + name + ",年龄：" + age);
    }

    /*
    *  被 static 修饰的方法
    *  作为静态方法的集合
    *  使用时通过类名调用，与类构造的对象无关
    * */
    static int count = 0;

    public static int maxNum(int a,int b){
        if(a<b){
            return b;
        }else{
            return a;
        }
    }

    public static void add(){
        count++;
    }
}
