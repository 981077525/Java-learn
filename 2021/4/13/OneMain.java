package day03_4_13;

import java.util.*;

public class OneMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        char[] strArray = str.toCharArray();

        String numstrret = "";
        String numstrtmp = "";

        int i = 0;

        while (i < strArray.length - 1) {
            i++;
            if (getNumber(strArray[i])) {
                numstrtmp += strArray[i];
                continue;
            }
            if(!getNumber(strArray[i]) || i == strArray.length - 1){
                if (numstrret.length() < numstrtmp.length()) {
                    numstrret = numstrtmp;
                }
                numstrtmp = "";
                continue;
            }
        }
        System.out.println(numstrret);
    }

    private static boolean getNumber(char c) {
        for (int i = 0; i < 10; i++) {
            if (c == getChar(i)) {
                return true;
            }
        }
        return false;
    }

    private static char getChar(int i) {
        switch (i) {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';

            case 4:
                return '4';

            case 5:
                return '5';

            case 6:
                return '6';

            case 7:
                return '7';
            case 8:
                return '8';
            case 9:
                return '9';
            default:
                return '-';
        }
    }
}
