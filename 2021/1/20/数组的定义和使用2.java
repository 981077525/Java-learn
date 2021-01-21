public class Two_Two {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d" ,arr[i]);
        }
        System.out.printf("\n------------------\n");
        for(int b:arr) {
            System.out.printf("%d" ,b);
        }
    }
}
