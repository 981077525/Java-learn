public class 形参的改变不会影响实参 {
    // 形式参数并不会影响到实际传入的参数
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        swap(x,y);
        System.out.println(x);
        System.out.println(y);
    }
    public static void swap(int a, int b){
        int c = a;
        a = b;
        b = c;
    }
}
