package org.example;

public class Lin<T> {
    public CustomNode<T> head;
    public CustomNode<T> tail;
    long size = 0;

    public Lin() {
        CustomNode<T> head;
        CustomNode<T> tail;
    }


    public Lin<T> add(T value) {
        CustomNode<T> node = new CustomNode<T>(value);
        CustomNode<T> temp = this.tail;
        if (this.head == null || this.tail == null) {
            this.head = node;
            this.tail = node;
            size++;
        } else {
            tail = node;
            tail.previous = temp;
            temp.next = tail;
            size++;
        }
        return this;
    }

    public void reverse() {
        CustomNode<T> temp = tail.next; //  null для head.prev

        if (this.size > 1) {
            //меняем местами первый и последний элементы
            head = tail; // 5
            head.next = tail.previous; //4 # ССылка на prev.tail
            head.previous = temp; //null

            tail = head.next; // 4 #
            temp = tail.previous; // следующий tail 3

            while (temp != null) {
                tail.previous = tail.next; // 5
                tail.next = temp;
                tail = temp;
                temp = temp.previous;
            }

            temp = tail.previous;
            tail.previous = tail.next; // 5
            tail.next = temp;
        }
        else {
            System.err.println("size does not allow reverse the list");
            System.err.println("size : " + size );
        }
    }

    public void print() {
        CustomNode<T> currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.next;
        }
    }

}

