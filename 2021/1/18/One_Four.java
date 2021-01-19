//实现函数 ToLowerCase() ，该函数接收一个字符串参数 str ，并将该字符串中的大写字母转换成小写字母，
//之后返回新的字符串 。
public class One_Four {

    public static void main(String[] args) {
        ToLowerCase("Hello World");
    }
    public static void ToLowerCase(String str){
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<str.length();i++){
//            char c = str;
            char c = str.charAt(i);

            if(Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            }
            else{
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
