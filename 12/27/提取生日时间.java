import java.util.Scanner;

public class Birth {
    public static void main(String[] args)
    {
        Scanner scanf= new Scanner(System.in);
        int birth = scanf.nextInt();

        System.out.printf("year=%d\n",birth / 10000);
        System.out.printf("month=%02d\n",(birth % 1000) / 100);
        System.out.printf("date=%02d" , birth % 100);
    }

}
