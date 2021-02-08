public class StudentTest {
    public static void main(String[] args) {

        // 定义两个学生对象
        Student stu1 = new Student();
        Student stu2 = new Student();

        // 修改两个对象的属性值
        stu1.name = "张三";
        stu1.age = 18 ;
        stu1.height = 180;

        stu2.name  = "李四";
        stu2.age = 20;
        stu2.height = 185;

        // 调用两个对象各自的 myselfInformence 方法
        stu1.myselfInformence();
        stu2.myselfInformence();
    }
}

