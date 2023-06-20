package org.example;

public class CustomNode<T> {
    T value;
    CustomNode next;

    public CustomNode(T value) {
        this.value = value;
        this.next = null;
    }


    public T getValue( ) {
        this.value = value;
        this.next = next;

        return value;
    }

}

