public class Two_Three {
    public static void main(String[] args) {
        //先初始化
        String[] arr = new String[5];
        //再赋值
        arr = new String[]{"Hello", "World", "CSDN", "QiuFengYaJu"};

        for(int i=0;i<arr.length;i++){
            System.out.printf("%s " ,arr[i]);
        }
        System.out.printf("\n------------------\n");
        for(String b:arr) {
            System.out.printf("%s " ,b);
        }
    }
}
