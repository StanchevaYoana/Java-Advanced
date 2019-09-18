package ListyIterator;

import java.util.List;

public class ListyIterator {
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
}
