package HashTable;

public class Node {
    // 1. 只实现 key，不实现 value
// 2. key 的类型先用 int 类型
// 3. 哈希函数: key MOD array.length
// 4. 插入 / 查找 / 删除
// 5. 使用单向链表
// 6. 使用头节点代表链表本身
    public int key;
    public Node next;

    public Node(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                '}';
    }
}

