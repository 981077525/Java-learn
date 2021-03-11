public class 权限控制Test {
    public static void main(String[] args) {
        权限控制 a = new 权限控制();
        // 输出对象a中的几个数据
        System.out.println(a.age);
        System.out.println(a.name);
//        System.out.println(a.id);
//        System.out.println(a.sex);
//        Error:(7, 29) java: id 在 权限控制 中是 private 访问控制
//        Error:(8, 29) java: sex 在 权限控制 中是 private 访问控制
        // 通过get读取方法来读取对象中不能能公开写，但能公开读的属性
        System.out.println(a.getId());
        System.out.println(a.getSex());

        // 通过set修改方法来修改对象中不能修改的属性值
        a.setId("610424");
        a.setSex(false);

        // 通过get读取方法来读取对象中不能能公开写，但能公开读的属性
        System.out.println(a.getId());
        System.out.println(a.getSex());

    }
}
