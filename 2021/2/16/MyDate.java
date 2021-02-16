package v1;

public class MyDate {
    // 一个关于日期的类

    // 年份
    public int year;
    // 月份
    public int month;
    // 日子
    public int day;

    /*
    *   类的构造器
    * */
    public MyDate(int a,int b, int c){
        this.year = a;
        this.month = b;
        this.day = c;
        // 判断年份是否合法
        if(a < 1900 || a > 2900){
            throw new RuntimeException("请输入合法的年份！为 1900 - 2900 年");
        }
        // 判断月份是否合法
        if(b<1 || b > 12){
            throw new RuntimeException("请输入合法的月份！为 1 - 12 月");
        }
        // 判断日期是否合法
        if(c<1||c>getMonthDay(year,month)){}
    }
    /*
    *   获取月份的日期
    * */
    private int getMonthDay(int year, int month) {
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return (isLeapYear(year))? 29 : 28;

            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }
    }

    /*
    *   获取年份的日期
    * */
    private int getYearDay(int year){
        if(isLeapYear(year)){
            return 366;
        }else{
            return 365;
        }
    }
    /*
    *   判断是否为闰年
    * */
    private boolean isLeapYear(int year){
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }

    //    一个关于日期间隔多少天计算的方法
    public int 相差天数(MyDate from){
        int ret = 0;
        int min = minNum(year,from.year);
        // 加上年份差的天数
        for(int i = minNum(year,from.year);i<maxNum(year,from.year);i++){
            ret += getYearDay(i);
        }
        // 加上月份差的天数
        for(int i = minNum(month,from.month);i<maxNum(month,from.month);i++){
            ret += getMonthDay(year,i);
        }
        // 加上差的天数
        ret +=  absoluteValue(day-from.day);

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
    /*
    *   返回最小值
    * */
    private int minNum(int a,int b){
        if(a>b){
            return b;
        }else{
            return a;
        }
    }
    /*
    *   返回最大值
    * */
    private int maxNum(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
