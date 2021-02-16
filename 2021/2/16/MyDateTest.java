package v1;

public class MyDateTest {
    public static void main(String[] args) {

        /*
        *   对象的实例化
        * */
        MyDate from = new MyDate(2001,07,13);

        MyDate to = new MyDate(2021,2,16);


        /*
        *   检测是否计算的一致
        * */
        System.out.println(from.相差天数(to));
        System.out.println(to.相差天数(from));


        /*
        *   检测三个报错
        * */
        MyDate falseobject = new MyDate(22222,2,13);
//        MyDate falseobject = new MyDate(2002,13,20);
//        MyDate falseobject = new MyDate(2002,1,39);

    }
}
