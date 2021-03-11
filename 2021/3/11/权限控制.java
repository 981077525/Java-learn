public class 权限控制 {
    /*
    *   public 公开的，任何类都可以进行访问
    *   private 私有的，只有当前类才可以使用
    * */

    // 公开的两个数据
    public int age = 18;     // 年龄
    public String name = "name"; // 姓名
    // 私有的两个数据
    private String id = "123456";  // 个人id
    private boolean sex = true;// 性别 true == 男 ，false == 女

    // 公开id的读取权限
    public String getId(){
        return id;
    }
    // 公开sex的读取权限
    public boolean getSex(){
        return sex;
    }

    // 公开id的修改权限
    public void setId(String id){
        this.id = id;
    }
    // 公开sex的修改权限
    public void setSex(boolean sex){
        this.sex = sex;
    }
}
