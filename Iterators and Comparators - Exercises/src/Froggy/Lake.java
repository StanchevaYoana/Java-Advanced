package Froggy;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {

    private List<Integer> lake;
    private int index;

    public Lake(List<Integer> data) {
        this.lake = data;
        this.index = 0;
    }

    private class Frog implements Iterator<Integer> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return this.index < lake.size();
        }

        @Override
        public Integer next() {
            int element = lake.get(this.index);
            this.index++;
            return element;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }
}
