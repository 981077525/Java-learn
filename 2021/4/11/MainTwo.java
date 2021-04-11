package day1_4_11;

import java.util.*;

public class MainTwo {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            String target = scanner.nextLine();

            char[] targetArray = target.toCharArray();

            Set<Character> targetSet = new TreeSet();

            for(int i = 0;i<targetArray.length;i++){
                targetSet.add(targetArray[i]);
            }

            for(int i = 0;i<str.toCharArray().length;i++){
                if(!targetSet.contains(str.toCharArray()[i])){
                    System.out.print(str.toCharArray()[i]);
                }
            }
        }
    }
}
