import java.lang.management.MemoryType;

public class 使用类和对象计算日期之间的差 {
    public static void main(String[] args) {
        // 定义一个对象，为其中的一个时间
        MyDate to = new MyDate();
        to.year = 2020;
        to.month = 12;
        to.day = 1;

        MyDate from = new MyDate();
        from.year = 1998;
        from.month = 9;
        from.day = 1;

        System.out.println(to.相差天数(from));
    }
}
