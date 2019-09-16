package CustomListSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> data;

    public CustomList() {
        this.data = new ArrayList<>();
    }

    public void add(T element) {
        this.data.add(element);
    }

    public T remove(int index) {
        return this.data.remove(index);
    }

    public boolean contains(T element) {
        return this.data.contains(element);
    }

    public void swap(int index1, int index2) {
        Collections.swap(this.data, index1, index2);
    }

    public int countGreaterThan(T value) {
        return (int) this.data.stream().filter(e -> e.compareTo(value) > 0).count();
    }

    public T getMax() {
        return Collections.max(this.data);
    }

    public T getMin() {
        return Collections.min(this.data);
    }

    public List<T> getData() {
        return data;
    }

    public <T extends Comparable<T>> void sort() {
        for (int i = 0; i < this.data.size(); i++) {
            for (int j = i + 1; j < this.data.size(); j++) {
                if (data.get(i).compareTo(data.get(j)) > 0) {
                    swap(i, j);
                }
            }
        }
    }
}
