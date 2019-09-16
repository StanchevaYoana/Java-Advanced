package Scale;

public class Scale<T extends Comparable<T>> {
    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

   public T getHeavier() {
        int comparator = left.compareTo(right);
        if (comparator > 0) {
            return this.left;
        }
        if (comparator < 0) {
            return this.right;

        }
        return null;
    }
}
