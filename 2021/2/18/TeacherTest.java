public class TeacherTest {
    public static void main(String[] args) {
        /*
        *   通过构造对象，调用方法
        * */
        Teacher li = new Teacher("李明",25);
        System.out.println(li.toString());  // 姓名：李明,年龄：25


        /*
        *   通过类调用静态方法
        * */
        System.out.println(Teacher.count);  // 0
        Teacher.add();
        System.out.println(Teacher.count);  // 1

        System.out.println(Teacher.maxNum(15,19));  // 19
    }
}
