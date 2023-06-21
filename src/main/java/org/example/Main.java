package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CustomNode node = new CustomNode<>("apple");
        Lin<Integer> lin = new Lin<Integer>();
        lin.add(1).add(2).add(3).add(4).add(5).add(6).add(7).add(8);

        lin.reverse();

    }
}
