package DoubleLinkedList;

import apdfaskf.Node;

public class DoubleLinkedList {

    public static No add(No head, int index, int new_data) {

        No new_No = new No(new_data);

        if (index == 1) {
            new_No.prox = head;
            if (head != null) {
                head.ant = new_No;
            }
            head = new_No;
            return head;
        }

        No actual = head;

        for (int i = 1; i < index - 1 && actual != null; ++i) {
            actual = actual.prox;
        }

        if (actual == null) {
            System.out.println("Posição fora do alcançe.");
            return head;
        }

        new_No.ant = actual;
        new_No.prox = actual.prox;
        actual.prox = new_No;

        if (new_No.prox != null) {
            new_No.prox.ant = new_No;
        }
        return head;
    }

    public void remove(Node head, int index) {

    }
}
