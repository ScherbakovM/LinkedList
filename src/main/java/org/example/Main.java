package org.example;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Lin newList = new Lin();

        newList.addLast(1).addLast(3).addLast(4).addLast(7).addLast(11);
        newList.addFirst("first");
        newList.print();

        System.out.println("индекс 5 = "+newList.getIndex(5).getValue());
    }
}
