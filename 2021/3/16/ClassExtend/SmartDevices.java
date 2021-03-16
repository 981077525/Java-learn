package ClassExtend;

public class SmartDevices {
    double length;
    double width;
    double hight;
    int power;
}

// 子类 Phone 继承 父类 SmartDevices
class Phone extends SmartDevices{
    String name;
    public Phone(String name){
        this.name = name;
    }
}

// 子类 Ipad 继承 父类 SmartDevices
class Ipad extends SmartDevices{
    String name;
    public Ipad(String name){
        this.name = name;
    }
}