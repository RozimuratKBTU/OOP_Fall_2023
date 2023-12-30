package labaratory3.Problem3;

public interface MyCollection<T> {
    void add(T Element);
    void remove(T element);
    void remove(int index);
    boolean contains(T element);
    void pushFront(T element);
    T getFront();
    T getBack();
    int size();
    void clear();
    boolean isEmpty();

}
