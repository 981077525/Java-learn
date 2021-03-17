public interface MyList {
    boolean add(String e);
    void add(int index, String e);

    String remove(int index);
    boolean remove(String e);

    String get(int index);
    String set(int index, String e);

    boolean contains(String e);
    int indexOf(String e);
    int lastIndexOf(String e);

    void clear();
    int size();
    boolean isEmpty();

    MyIterator iterator();
}
