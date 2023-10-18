package nl.han.ica.datastructures;

public class HANQueue<T> implements IHANQueue<T>{
    private HANLinkedList<T> queue;

    public HANQueue() {
        queue = new HANLinkedList<>();
    }

    @Override
    public void clear() {
        queue.clear();
    }

    @Override
    public boolean isEmpty() {
        return queue.getSize() == 0;
    }

    @Override
    public void enqueue(T value) {
        queue.addFirst(value);
    }

    @Override
    public T dequeue() {
        T value = queue.get(queue.getSize() - 1);
        queue.delete(queue.getSize() - 1);
        return value;
    }

    @Override
    public T peek() {
        return queue.get(queue.getSize() - 1);
    }

    @Override
    public int getSize() {
        return queue.getSize();
    }
}
