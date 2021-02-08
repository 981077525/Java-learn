import java.util.Arrays;

public class 自定义类定义数据 {

    public static void main(String[] args) {
        // 使用 Student 类实例化一个对象
        Student dp = new Student();
        Student dr = new Student();

        dp.name = "dongpeng";
        dp.age = 18;
        dp.height = 175;
        System.out.println(dp.name + "  " + dp.age + "   " + dp.height);
        System.out.println(dr.name + "  " + dr.age + "   " + dr.height);
    }
}
