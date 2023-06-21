package org.example;

public class CustomNode<T> {
    T value;
    public CustomNode<T> next;
    public CustomNode<T> previous;

    public CustomNode(T value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public T getValue() {
        return this.value;
    }

}

