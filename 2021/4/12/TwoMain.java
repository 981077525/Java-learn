package day02_4_12;

import java.util.*;

public class TwoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String[] strArray = str.split(" ");

        for(int i = strArray.length - 1;i>=1;i--){
            System.out.print(strArray[i] + " ");
        }
        System.out.println(strArray[0]);
    }
}
