package Collection;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {
    private List<String> data;
    private int index;

    public ListyIterator(List<String> data) {
        this.data = data;
        this.index = 0;
    }

    public boolean move() {
        if (this.hasNext()) {
            index++;
            return true;

        } else {
            return false;
        }
    }

    public boolean hasNext() {
        return this.index < this.data.size() - 1;
    }

    public String print() {
        if (this.data.isEmpty()) {
            return "Invalid Operation!";
        } else {
            return this.data.get(this.index);
        }
    }

    public void printAll() {
        for (String datum : data) {
            System.out.print(datum + " ");
        }
        System.out.println();

    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return this.index < data.size();
            }

            @Override
            public String next() {
                String element = data.get(this.index);
                this.index++;
                return element;
            }
        };
    }
}
