import java.util.Comparator;
import java.util.PriorityQueue;


public class StringCompare implements Comparator<String> {
    String e;

    @Override
    public int compare(String o1, String o2) {
        return transform(o1) - transform(o2);
    }

    public int transform(String o) {
        switch (e){
            case "鼠" : return 0;
            case "牛" : return 1;
            case "虎" : return 2;
            default: return -1;
        }
    }

    public static void main(String[] args) {

        Comparator<String> comparator = new StringCompare();
        PriorityQueue<String> queue = new PriorityQueue<>(comparator);

        queue.add("鼠");
        queue.add("虎");
        queue.add("牛");

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    } 


}
