package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CustomNode node = new CustomNode<>("apple");
        Lin<Integer> lin = new Lin<Integer>();
        lin.add(1);
        lin.reverse();
        lin.print();
    }
}
