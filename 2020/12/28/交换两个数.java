public class SwapNumber {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println("a = :" + a);
        System.out.println("b = :" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("-----------------");

        System.out.println("a = :" + a);
        System.out.println("b = :" + b);
    }

}
