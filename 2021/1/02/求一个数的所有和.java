public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
    public static int sum(int a){

        if(a < 1)
        {
            return a;
        }
        return a + sum(--a);
    }
}
