public class TwoArrrayBinarySearchTest {

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(TwoArrrayBinarySearch.twoArrayBinarySearch(arr, 5));
        System.out.println(TwoArrrayBinarySearch.twoArrayBinarySearch(arr, 6));
        System.out.println(TwoArrrayBinarySearch.twoArrayBinarySearch(arr, 7));
    }
}
