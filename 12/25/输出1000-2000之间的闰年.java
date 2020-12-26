public class LeapYear {
    public static void main(String[] args) {
        int a = 1000;
        int b = 2000;
        leapYear(a, b);
    }

    public static void leapYear(int n, int m)
    {
        //输出n到m之间的闰年
        // 闰年：能被4整除且不能被100整除，或者能被400整除
        for (int i = n; i <= m; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
            {
                System.out.println(i);

            }
        }
    }
}
