package day04_4_14;

import java.util.*;

public class OneMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }
        int a = (arr[0] + arr[2]) / 2;
        int b = (arr[1] + arr[3]) / 2;
        int c = arr[3] - b;
        if ((arr[0] + arr[2]) % 2 == 0 && (arr[1] + arr[3]) % 2 == 0 && arr[3] - ((arr[1] + arr[3]) / 2) >= 0 && a >= 0 && b >= 0 && c >= 0) {
            System.out.println(a + " " + b + " " + c);
        } else {
            System.out.println("No");
        }
    }
}
