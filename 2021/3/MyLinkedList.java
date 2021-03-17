import java.util.LinkedList;

// 双向链表的链表类
public class MyLinkedList implements MyList {
    public MyListNode head;
    // 为了提升尾插的效率，记录最后一个结点的位置
    public MyListNode last;

    public MyLinkedList() {
        head = null;
        last = null;
    }

    // O(1)
    @Override
    public boolean add(String e) {
        // 1. 把 e 装入结点中
        MyListNode node = new MyListNode(e);

        if (head == null) {
            head = node;
            last = node;
        } else {
            node.prev = last;
            last.next = node;
            last = node;
        }
        return true;

//        if (head == null) {
//            head = node;
//        } else {
//            MyListNode last = head;
//            while (last.next != null) {
//                last = last.next;
//            }
//
//            last.next = node;
//        }
//
//        return true;
    }

    // O(n)
    @Override
    public void add(int index, String e) {
        // 1. 先判断下标的合法性
        // [0, size()]
        if (index < 0 || index > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        // 0. 把元素装入结点中
        MyListNode node = new MyListNode(e);

        if (index == 0) {
            node.next = head;
            head.prev = node;
            head = node;

            return;
        }

        // 插入到链表的最后端 last

        if (index == size()) {
            add(e);
        }

        // 1. 先找到待插入位置的前驱结点
        // 2. 需要从 head 开始，向后跳 index - 1 步
        MyListNode prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        MyListNode next = prev.next;
        // 3. 插入 O(1)
        node.prev = prev;
        node.next = next;
        prev.next = node;
        next.prev = node;
    }

    @Override
    public String remove(int index) {

        if(index < 0 || index >= size() ){
            throw new ArrayIndexOutOfBoundsException();
        }
        String e;
        if(index == 0 ){
            head = head.next;
            head.prev =null;
            return null;
        }else if(size() == 1){
            e = head.val;
            head = null;
            last = null;
        }else if(index == size() - 1){
            e =last.val;
            last = last.prev;
            last.next = null;
        }else{

            MyListNode toDelet = head;

            for(int i = 0;i<index;i++){
                toDelet = toDelet.next;
            }
            e = toDelet.val;
            MyListNode prev = toDelet.prev;
            MyListNode next = toDelet.next;

            next.prev = prev;
            prev.next = next;
        }
        return e;



    }

    @Override
    public boolean remove(String e) {
        return false;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public String set(int index, String e) {
        return null;
    }

    @Override
    public boolean contains(String e) {
        return false;
    }

    @Override
    public int indexOf(String e) {
        return 0;
    }

    @Override
    public int lastIndexOf(String e) {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        int count = 0;
        MyListNode cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }

        return count;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public MyIterator iterator() {
        return null;
    }

    // String 对象讲的知识点
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[");

        MyListNode cur = head;
        while (cur != null) {
            sb.append(",");
            sb.append(cur.val);

            cur = cur.next;
        }
        sb.append("]");

        return sb.toString();

        // 因为 String 不可变对象的特性，所有不要循环中执行 s = s + ...
//        String ans = "[";
//
//        // 通过遍历所有结点
//        MyListNode cur = head;
//        while (cur != null) {
//            ans = ans + ", " + cur.val;
//            cur = cur.next;
//        }
//        ans = ans + "]";
//        return ans;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add("123");
        list.add("456");
        System.out.println(list);

        list.remove(0);

        System.out.println(list);
    }
}
