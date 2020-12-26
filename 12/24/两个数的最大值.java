public class NumMax{
    public static int max(int a,int b){
        if(a > b)
        {
            return a;
        }
        else if(a = b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        System.out.printf("%d",max(a,b));
    }
}