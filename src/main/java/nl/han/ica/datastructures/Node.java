package nl.han.ica.datastructures;

public class Node<T> {
    T element;
    Node<T> next;

    Node(T element)
    {
        this.element = element;
        next = null;
    }
}
