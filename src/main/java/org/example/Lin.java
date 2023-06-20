package org.example;

import java.util.ArrayList;

public class Lin<T> {
    private CustomNode head;
    private CustomNode tail;
    long size = 0;

    public Lin( ) {
        CustomNode head;
        CustomNode tail;
    }

    public Lin add(CustomNode node) {

        if (this.head == null || this.tail == null) {
            this.head = node;
            this.tail = node;
            size++;
            return this;
        } else {
            this.tail.next = node;
            this.tail = node;
            size++;
            return this;
        }
    }

    public Lin addLast(T value) {
        CustomNode node = new CustomNode(value);
        if (this.head == null || this.tail == null) {
            this.head = node;
            this.tail = node;
            size++;
            return this;
        } else {
            this.tail.next = node;
            this.tail = node;
            size++;
            return this;
        }
    }

    public Lin addFirst(T value) {
        CustomNode node = new CustomNode(value);
        if (this.head == null || this.tail == null) {
            this.head = node;
            this.tail = node;
            size++;
            return this;
        } else {
            node.next = head;
            head = node;
            size++;
            return this;
        }
    }

    public Lin dell(int index) {
        return  this;
    }

    public CustomNode getHead( ) {
        return head;
    }

    public CustomNode getTail( ) {
        return tail;
    }


    public CustomNode getIndex(int index) {
        CustomNode currentNode = head;
        int count  = 0;
        while (currentNode != null) {
            if( count == index){
                return currentNode;
            } else {
                currentNode = currentNode.next;
                count++;
            }
        }
        return currentNode;
    }

    public void print( ) {
        CustomNode currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.next;
        }
    }
}

