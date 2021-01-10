import java.util.Scanner;

public class Leetcode1556 {
    //给你一个整数 n，请你每隔三位添加点（即 "." 符号）作为千位分隔符，并将结果以字符串格式返回。
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        while(scanf.hasNextInt())
        {
            int n = scanf.nextInt();
            String s = thousandSeparator(n);
            System.out.println(s);
        }

    }

    public static String thousandSeparator(int n) {
                //判断是否为0
                if (n == 0) {
                    return "0";
                }
                //定义返回值字符串
                String ans = "";
                //定义循环次数，是否为第一次
                int count = 1;
                //循环分割
                while (n > 0) {
                    int a = n % 1000;
                    if (count == 1) {
                        if(n>=1000 && a <1000)
                        {
                            if (a < 100 && a > 10) {
                                ans = "0" + a + "" + ans;
                            } else if (a < 10) {
                                ans = "00" + a + "" + ans;
                            }else {
                                ans = a + "" + ans;
                            }
                        }
                        else{
                            ans = a + "" + ans;
                        }
                    } else {
                        if(n>=1000 && a <1000)
                        {
                            if (a < 100 && a > 10) {
                                ans = "0" + a + "." + ans;
                            } else if (a < 10) {
                                ans = "00" + a + "." + ans;
                            }else {
                                ans = a + "." + ans;
                            }
                        }
                        else{
                            ans = a + "." + ans;
                        }
                    }
                    n /= 1000;
                    count++;
                }
                return ans;
            }
        }

