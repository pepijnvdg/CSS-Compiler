package nl.han.ica.datastructures;

public class HANLinkedList<T> implements IHANLinkedList<T>{

    private Node<T> header;

    @Override
    public void addFirst(T value) {
        Node<T> new_node = new Node(value);
        new_node.next = header;
        header = new_node;
    }

    @Override
    public void clear() {
        header = null;
    }

    @Override
    public void insert(int index, T value) {
        Node<T> new_node = new Node(value);
        Node<T> current = header;
        int counter = 0;
        while (current.next != null && counter != index) {
            current = current.next;
            counter++;
        }
        new_node.next = current.next;
        current.next = new_node;
    }

    @Override
    public void delete(int pos) {
        Node<T> current = header;
        int counter = 0;
        while (current.next != null && counter != pos) {
            current = current.next;
            counter++;
        }
        current.next = current.next.next;
    }

    @Override
    public T get(int pos) {
        Node<T> current = header;
        int counter = 0;
        while (current.next != null && counter != pos) {
            current = current.next;
            counter++;
        }
        return current.element;
    }

    @Override
    public void removeFirst() {
        header = header.next;
    }

    @Override
    public T getFirst() {
        return header.element;
    }

    @Override
    public int getSize() {
        Node<T> current = header;
        int counter = 0;
        while (current.next != null) {
            current = current.next;
            counter++;
        }
        return counter;
    }
}
