package chap10.storage;

public interface Storage<T> {
    void add(T item, int index);

    T get(int index);
}