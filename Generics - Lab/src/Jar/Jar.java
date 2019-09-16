package Jar;

import java.util.ArrayDeque;

public class Jar<T> {
    private ArrayDeque<T> data;

    public Jar() {
        this.data = new ArrayDeque<>();
    }

    public void add(T value) {
        this.data.push(value);
    }

    public T remove() {
        return this.data.pop();
    }

}
