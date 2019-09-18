package StackIterator;

import java.util.Iterator;

public class CustomStack implements Iterable<Integer> {
    private Node top;


    private class Node {
        private int element;
        private Node prev;


        Node(int element) {
            this.element = element;
            this.prev = null;
        }
    }

    public CustomStack() {
        this.top = null;
    }

    public void push(int element) {
        Node newNode = new Node(element);
        if (this.top == null) {
            this.top = newNode;
        } else {
            newNode.prev = this.top;
            this.top = newNode;
        }

    }

    public int pop() {
        if (this.top == null) {
            throw new IllegalArgumentException("No elements");
        } else {
            int element = this.top.element;
            this.top = this.top.prev;
            return element;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private Node currentNode = top;

            @Override
            public boolean hasNext() {
                return this.currentNode != null;
            }

            @Override
            public Integer next() {
                int element = this.currentNode.element;

                this.currentNode = this.currentNode.prev;
                return element;
            }
        };
    }
}

