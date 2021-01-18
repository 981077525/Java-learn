//在java中，在同一包内，类Cat里面有个公有方法sleep()，该方法前有static修饰，则可以直接用Cat.sleep()。 （  ） A： 正确 B: 错误

//答：正确
public class one_two {
    public static void main(String[] args) {
        Cat.sleep();
    }
}
