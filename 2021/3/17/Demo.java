import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> demo = new LinkedList<>();

        System.out.println(demo);
        System.out.println(demo.isEmpty());
        System.out.println(demo.size());
        System.out.println("==============");

        demo.add(" 一 ");
        demo.add(" 二 ");

        System.out.println(demo);
        System.out.println(demo.get(1));
        System.out.println(demo.size());
        System.out.println("==============");

        demo.set(0,"三");
        System.out.println(demo.getFirst());


        LinkedList<String> list = new LinkedList<>();
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println("===========================");

        list.add("你");
        list.add("我");
        list.add("他");
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println("===========================");

        System.out.println(list.get(0));
        System.out.println(list.set(1, "没什么"));
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println("===========================");

        System.out.println(list.contains("我"));
        System.out.println(list.contains("你"));
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println("===========================");

        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println("===========================");

    }
}
