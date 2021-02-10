public class MyDate {
    // 一个关于日期的类

    // 年份
    public int year;
    // 月份
    public int month;
    // 日子
    public int day;



//    一个关于日期间隔多少天计算的方法
    public int 相差天数(MyDate from){
        int ret = 0;

        if(year != from.year){
            ret += absoluteValue((from.year - year) * 365);
        }

        if(month != from.month){
            ret += absoluteValue((from.month - month) * 30);
        }

        if(day != from.day){
            ret +=  absoluteValue(from.day - day);
        }

        return ret;
    }
    /*
    *  一个返回绝对值的方法
    * */
    public static int absoluteValue(int num){
        if(num < 0){
            return -num;
        }else{
            return num;
        }
    }

}
