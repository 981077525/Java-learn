public class TriangleTest {
    public static void main(String[] args) {
        Triangle a = new Triangle(3,1,2);
        Triangle b = new Triangle(5,8,10);

        // 判断是否为三角形
        System.out.println(a.isTriange());
        System.out.println(b.isTriange());

        // 求其周长
//        System.out.println(a.circumferenceTriangle());
        System.out.println(b.circumferenceTriangle());

        // 利用重写的toString输出
//        System.out.println(a);
        System.out.println(b);
    }
}
