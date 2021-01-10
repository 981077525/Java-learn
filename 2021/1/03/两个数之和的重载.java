public class Sum{
    public static void main(String[] args){
        System.out.println(sumNum(1,2));
        System.out.println(sumNum(1.2,2.3));
        System.out.println(sumNum(1.2,2));
        System.out.println(sumNum(1,2.3));
    }
    public static int sumNum(int a,int b){
        return a+b;
    }
    public static double sumNum(double a,double b){
        return a+b;
    }
    public static double sumNum(double a,int b){
        return a+b;
    }
    public static double sumNum(int a,double b){
        return a+b;
    }
}