/*
*   一个关于三角形的类
*
*   创建一个三角形类，成员变量三边，方法求周长，创建类主类A来测试它。
* */
public class Triangle {

    // 属性：三角形的三个边
    double a;
    double b;
    double c;

    /*
    *   构造器
    * */
    public Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /*
    *   判断是否为三角形
    * */
    public boolean isTriange(){
        if((a+b)>c && (a+c)>b && (b+c)>a && (a-b)<c && (a-c)<b && (b-c)<a){
            return true;
        }else{
            return false;
        }
    }
    /*
    *   求三角形周长的一个方法
    * */
    public double circumferenceTriangle(){
        if(isTriange()){
            return a+b+c;
        }else{
            throw new RuntimeException("该三条边无法构成三角型！");
        }
    }

    public String toString(){
        if(isTriange()){
            return "该三角形是一个三边分别为：" + a + "、" + b + "、" + c + "的三角形";
        }else{
            throw new RuntimeException("该三条边无法构成三角型！");
        }
    }
}
