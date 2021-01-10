public class MaxNumber2_3 {
    public static void main(String[] args) {
        System.out.println(max3(452,5962,62));
    }
    //求两个数的最大值
    public static int max2(int a,int b )
    {
        if(a>b)
        {
            return a;
        }
        else if( a == b)
        {
            return a;
        }
        else {
            return b;
        }
    }
    //求三个数的最大值
    public static int max3(int a,int b,int c)
    {
        if(max2(a,b) == a)
        {
            if(max2(a,c) == a)
            {
                 return a;
            }
            else
            {
                return c;
            }
        }
        else{
            if(max2(b,c) == b)
            {
                return b;
            }
            else
            {
                return c;
            }
        }
    }
}
